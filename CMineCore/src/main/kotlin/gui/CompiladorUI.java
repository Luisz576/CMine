package gui;

import com.cmine.lexicon.LexiconAnalyzer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.*;
import java.util.Objects;

public class CompiladorUI extends JFrame {
    private final JTextArea editorArea;
    private final JTextArea terminalArea;
    private File currentFile = null;

    public CompiladorUI() {
        setTitle("IDE - CMine");
        setSize(1024, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        editorArea = new JTextArea();
        editorArea.setFont(new Font("Arial", Font.PLAIN, 14));
        editorArea.setBackground(new Color(33, 38, 45,255));
        editorArea.setForeground(Color.WHITE);
        editorArea.setCaretColor(Color.WHITE);

        terminalArea = new JTextArea();
        terminalArea.setFont(new Font("Consolas", Font.PLAIN, 12));
        terminalArea.setEditable(false);
        terminalArea.setBackground(new Color(21, 24, 28, 255));
        terminalArea.setForeground(Color.WHITE);

        JMenuBar menuBar = createMenuBar();
        setJMenuBar(menuBar);

        JToolBar toolBar = createToolBar();

        setLayout(new BorderLayout());

        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                new JScrollPane(editorArea),
                new JScrollPane(terminalArea));
        splitPane.setResizeWeight(0.7);

        add(toolBar, BorderLayout.NORTH);
        add(splitPane, BorderLayout.CENTER);

        getRootPane().setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, new Color(0xC0C0C0)));
        ((JComponent) getContentPane()).setBorder(new EmptyBorder(0, 0, 0, 0));
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Arquivo");
        addMenuItem(fileMenu, "Novo", "new.png", this::newFile);
        addMenuItem(fileMenu, "Abrir", "open.png", this::openFile);
        addMenuItem(fileMenu, "Salvar", "save.png", this::saveFile);
        addMenuItem(fileMenu, "Salvar Como", "save-as.png", this::saveFileAs);
        fileMenu.addSeparator();
        addMenuItem(fileMenu, "Sair", "close.png", this::exitApplication);

        JMenu editMenu = new JMenu("Editar");
        addMenuItem(editMenu, "Desfazer", "undo.png", this::undo);
        addMenuItem(editMenu, "Refazer", "redo.png", this::redo);
        editMenu.addSeparator();
        addMenuItem(editMenu, "Recortar", "cut.png", this::cut);
        addMenuItem(editMenu, "Copiar", "copy.png", this::copy);
        addMenuItem(editMenu, "Colar", "paste.png", this::paste);

        JMenu viewMenu = new JMenu("Visualizar");
        addMenuItem(viewMenu, "Aumentar Zoom", "zoom-in.png", this::zoomIn);
        addMenuItem(viewMenu, "Diminuir Zoom", "zoom-out.png", this::zoomOut);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);

        return menuBar;
    }

    private void addMenuItem(JMenu menu, String label, String iconName, Runnable action) {
        JMenuItem menuItem = new JMenuItem(label);
        try {
            ImageIcon icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/icons/" + iconName)));
            Image img = icon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
            menuItem.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.err.println("Ícone não encontrado: " + iconName);
        }
        menuItem.addActionListener(e -> action.run());
        menu.add(menuItem);
    }

    private JToolBar createToolBar() {
        JToolBar toolBar = new JToolBar();
        toolBar.setFloatable(false);
        toolBar.setBorderPainted(false);
        toolBar.setBackground(new Color(236, 236, 236));

        toolBar.addSeparator(new Dimension(5, 0));

        addToolBarButton(toolBar, "Novo", "new.png", this::newFile);
        toolBar.addSeparator(new Dimension(5, 0));
        addToolBarButton(toolBar, "Abrir", "open.png", this::openFile);
        toolBar.addSeparator(new Dimension(5, 0));
        addToolBarButton(toolBar, "Salvar", "save.png", this::saveFile);
        toolBar.addSeparator(new Dimension(10, 0));
        toolBar.addSeparator();
        toolBar.addSeparator(new Dimension(10, 0));
        addToolBarButton(toolBar, "Recortar", "cut.png", this::cut);
        toolBar.addSeparator(new Dimension(5, 0));
        addToolBarButton(toolBar, "Copiar", "copy.png", this::copy);
        toolBar.addSeparator(new Dimension(5, 0));
        addToolBarButton(toolBar, "Colar", "paste.png", this::paste);

        toolBar.add(Box.createHorizontalGlue());

        JButton compileButton = createStyledButton("Executar", "start.png", new Color(48, 105, 194));
        compileButton.addActionListener(e -> compilar());
        toolBar.add(compileButton);

        toolBar.addSeparator(new Dimension(5, 0));

        return toolBar;
    }

    private void addToolBarButton(JToolBar toolBar, String text, String iconName, Runnable action) {
        JButton button = createStyledButton(text, iconName, new Color(126, 126, 126));
        button.addActionListener(e -> action.run());
        toolBar.add(button);
    }

    private JButton createStyledButton(String text, String iconName, Color baseColor) {
        JButton button = new JButton(text) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                if (getModel().isPressed()) {
                    g2.setColor(baseColor.darker());
                } else if (getModel().isRollover()) {
                    g2.setColor(baseColor.brighter());
                } else {
                    g2.setColor(baseColor);
                }

                g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 5, 5);

                g2.setColor(Color.WHITE);
                g2.setFont(getFont());
                FontMetrics fm = g2.getFontMetrics();
                int textX = (getWidth() - fm.stringWidth(getText())) / 2;
                int textY = (getHeight() - fm.getHeight()) / 2 + fm.getAscent();

                if (getIcon() != null) {
                    int iconY = (getHeight() - getIcon().getIconHeight()) / 2;
                    getIcon().paintIcon(this, g2, 5, iconY);
                    textX = getIcon().getIconWidth() + 10;
                }

                g2.drawString(getText(), textX, textY);
                g2.dispose();
            }
        };

        try {
            ImageIcon icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/icons/" + iconName)));
            Image img = icon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
            button.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.err.println("Ícone não encontrado: " + iconName);
        }

        button.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        button.setForeground(Color.WHITE);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setOpaque(false);
        button.setPreferredSize(new Dimension(100, 40));

        return button;
    }

    private JButton createCompileButton() {
        JButton compileButton = new JButton("Compilar") {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                if (getModel().isPressed()) {
                    g2.setColor(new Color(0, 122, 255));
                } else if (getModel().isRollover()) {
                    g2.setColor(new Color(0, 122, 255, 220));
                } else {
                    g2.setColor(new Color(0, 122, 255, 180));
                }

                g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 8, 8);

                g2.setColor(Color.WHITE);
                g2.setFont(getFont());
                FontMetrics fm = g2.getFontMetrics();
                int x = (getWidth() - fm.stringWidth(getText())) / 2;
                int y = (getHeight() - fm.getHeight()) / 2 + fm.getAscent();
                g2.drawString(getText(), x, y);
                g2.dispose();
            }
        };

        compileButton.setPreferredSize(new Dimension(90, 40));
        compileButton.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        compileButton.setForeground(Color.WHITE);
        compileButton.setBorderPainted(false);
        compileButton.setContentAreaFilled(false);
        compileButton.setFocusPainted(false);
        compileButton.setOpaque(false);
        compileButton.addActionListener(e -> compilar());

        return compileButton;
    }

    private void compilar() {
        String codigo = editorArea.getText();
        terminalArea.setText("");

        try {
            LexiconAnalyzer analyzer = new LexiconAnalyzer();
            java.util.List<com.cmine.token.Token> tokens = analyzer.analyze(new java.io.BufferedReader(new java.io.StringReader(codigo)));

            for (com.cmine.token.Token token : tokens) {
                terminalArea.append(String.format("'%s' (%s)%n", token.expression(), token.tokenName()));
            }

        } catch (Exception e) {
            terminalArea.append("Erro: " + e.getMessage() + "\n");
            if (e instanceof com.cmine.token.exception.InvalidTokenException) {
                com.cmine.token.exception.InvalidTokenException ite = (com.cmine.token.exception.InvalidTokenException) e;
                terminalArea.append("Expressão inválida: '" + ite.getExpression() + "'\n");
            }
        }
    }

    private void newFile() {
        editorArea.setText("");
        currentFile = null;
        terminalArea.setText("Novo arquivo criado.\n");
    }

    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                StringBuilder content = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
                editorArea.setText(content.toString());
                currentFile = selectedFile;
                terminalArea.setText("Arquivo aberto: " + selectedFile.getName() + "\n");
            } catch (IOException e) {
                terminalArea.setText("Erro ao abrir o arquivo: " + e.getMessage() + "\n");
            }
        }
    }

    private void saveFile() {
        if (currentFile == null) {
            saveFileAs();
        } else {
            saveToFile(currentFile);
        }
    }

    private void saveFileAs() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            saveToFile(selectedFile);
        }
    }

    private void saveToFile(File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(editorArea.getText());
            currentFile = file;
            terminalArea.setText("Arquivo salvo: " + file.getName() + "\n");
        } catch (IOException e) {
            terminalArea.setText("Erro ao salvar o arquivo: " + e.getMessage() + "\n");
        }
    }

    private void exitApplication() {
        System.exit(0);
    }

    private void undo() {
        terminalArea.setText("Função 'Desfazer' não implementada.\n");
    }

    private void redo() {
        terminalArea.setText("Função 'Refazer' não implementada.\n");
    }

    private void cut() {
        editorArea.cut();
        terminalArea.setText("Texto recortado.\n");
    }

    private void copy() {
        editorArea.copy();
        terminalArea.setText("Texto copiado.\n");
    }

    private void paste() {
        editorArea.paste();
        terminalArea.setText("Texto colado.\n");
    }

    private void zoomIn() {
        changeFont(editorArea.getFont().getSize() + 2);
        terminalArea.setText("Zoom aumentado.\n");
    }

    private void zoomOut() {
        changeFont(editorArea.getFont().getSize() - 2);
        terminalArea.setText("Zoom diminuído.\n");
    }

    private void changeFont(int size) {
        Font currentFont = editorArea.getFont();
        Font newFont = new Font(currentFont.getFontName(), currentFont.getStyle(), size);
        editorArea.setFont(newFont);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CompiladorUI ide = new CompiladorUI();
            ide.setVisible(true);
        });
    }
}