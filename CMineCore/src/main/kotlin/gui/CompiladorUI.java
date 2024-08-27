package gui;

import com.cmine.lib.CMineLib;
import com.cmine.lexicon.LexiconAnalyzer;
import com.cmine.lib.CMineLibLexer;
import com.cmine.symbol_table.exception.InvalidSymbolException;
import com.cmine.syntaix.SyntaxException;
import com.cmine.token.exception.LexiconException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.*;
import java.util.Objects;

import static java.sql.DriverManager.println;

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

        toolBar.addSeparator(new Dimension(5, 0));

        // Botão "Listar Tokens"
        JButton listTokensButton = createStyledButton("Tokens", "tokens.png", new Color(126, 126, 126));
        listTokensButton.addActionListener(e -> listTokens());  // Chama a função listTokens quando clicado
        toolBar.add(listTokensButton);

        toolBar.addSeparator(new Dimension(5, 0));

        toolBar.add(Box.createHorizontalGlue());

        JButton compileButton = createStyledButton("Compilar", "start.png", new Color(48, 105, 194));
        compileButton.addActionListener(e -> {
            try {
                compile();
            } catch (LexiconException ex) {
                throw new RuntimeException(ex);
            } catch (SyntaxException ex) {
                throw new RuntimeException(ex);
            }
        });
        toolBar.add(compileButton);

        toolBar.addSeparator(new Dimension(5, 0));

        return toolBar;
    }

    private void listTokens() {
        StringBuilder tokens = new StringBuilder("<html><body style='font-family:Arial; color:#333;'>");
        tokens.append("<h2 style='color:#2c3e50;'>📘 Estrutura Padrão - Exemplo</h2><br>")
                .append("<pre style='background-color:#ecf0f1; padding:15px; color:#2c3e50; font-size:14px;'>")
                .append("<span style='color:#34495e;'><b>IFSULDEMINAS</b></span><br><br>")
                .append("<span style='color:#e74c3c;'><b>journey</b></span>(<span style='color:#2980b9;'>enemiesToSpawn &gt; 0</span>) {<br>")
                .append("    <span style='color:#8e44ad;'>$spawnEnemy</span>();<br>")
                .append("    enemiesToSpawn--; <br>")
                .append("    ++enemiesToSpawn;<br>")
                .append("}<br><br>")
                .append("<span style='color:#e74c3c;'><b>quest</b></span> <span style='color:#8e44ad;'>$func</span>(<span style='color:#e67e22;'>coin a</span>) {<br>")
                .append("    <span style='color:#3498db;'>check</span> (<span style='color:#2980b9;'>velocity &gt; 50</span>) {<br>")
                .append("        loot <span style='color:#e67e22;'>a + 2</span>;<br>")
                .append("    }<br>")
                .append("    loot;<br>")
                .append("}<br><br>")
                .append("<span style='color:#e74c3c;'><b>task</b></span> (<span style='color:#2980b9;'>i = i + 1; i &lt; 5;</span>) {<br>")
                .append("    velocity = velocity * 2;<br>")
                .append("}<br><br>")
                .append("<span style='color:#e67e22;'>coin i = 10;</span><br><br>")
                .append("<span style='color:#e74c3c;'><b>task</b></span> (<span style='color:#2980b9;'>coin i = 10; i &lt; 5; i = i + 1</span>) {<br>")
                .append("    velocity = velocity * 2;<br>")
                .append("}<br><br>")
                .append("<span style='color:#8e44ad;'>$func</span>(<span style='color:#e67e22;'>20</span>);<br><br>")
                .append("<span style='color:#34495e;'><b>MUZ</b></span>")
                .append("</pre>")
                .append("</div><br>");

        tokens.append("<h2 style='color:#2c3e50;'>📜 Tokens Disponíveis</h2><br>");
        tokens.append("<h3 style='color:#2980b9;'>🛠️ <b>Códigos e Tipos:</b></h3>")
                .append("<ul>")
                .append("<li><b>T_CODE_S</b>: <span style='color:#27ae60;'>IFSULDEMINAS</span></li>")
                .append("<li><b>T_CODE_E</b>: <span style='color:#27ae60;'>MUZ</span></li>")
                .append("<li><b>T_CV_TYPE</b>: <span style='color:#27ae60;'>coin (int), money (double), text (String), completed (bool), list</span></li>")
                .append("</ul><br>");

        tokens.append("<h3 style='color:#2980b9;'>🔑 <b>Identificadores:</b></h3>")
                .append("<ul>")
                .append("<li><b>T_ID_VAR</b>: <span style='color:#f39c12;'>life, velocity, etc.</span></li>")
                .append("<li><b>T_ID_CONST</b>: <span style='color:#f39c12;'>#maxlife, #speed, etc.</span></li>")
                .append("</ul><br>");

        tokens.append("<h3 style='color:#2980b9;'>➕ <b>Operadores:</b></h3>")
                .append("<ul>")
                .append("<li><b>T_OP_UN</b>: <span style='color:#c0392b;'>++</span>, <span style='color:#c0392b;'>--</span><br><i>Exemplo:</i> <span style='color:#16a085;'>++velocity</span>, <span style='color:#16a085;'>--lives</span></li>")
                .append("<li><b>T_OP_REL</b>: <span style='color:#c0392b;'>&lt;</span>, <span style='color:#c0392b;'>&gt;</span>, <span style='color:#c0392b;'>&lt;=</span>, <span style='color:#c0392b;'>&gt;=</span>, <span style='color:#c0392b;'>==</span>, <span style='color:#c0392b;'>!=</span><br><i>Exemplo:</i> <span style='color:#16a085;'>velocity &gt; 50</span>, <span style='color:#16a085;'>1 &lt; 2</span></li>")
                .append("<li><b>T_OP_MATH</b>: <span style='color:#c0392b;'>+</span>, <span style='color:#c0392b;'>-</span>, <span style='color:#c0392b;'>*</span>, <span style='color:#c0392b;'>/</span>, <span style='color:#c0392b;'>%</span>, <span style='color:#c0392b;'>^</span><br><i>Exemplo:</i> <span style='color:#16a085;'>2 + 3</span>, <span style='color:#16a085;'>velocity * 2</span></li>")
                .append("<li><b>T_OP_ATR</b>: <span style='color:#c0392b;'>=</span><br><i>Exemplo:</i> <span style='color:#16a085;'>velocity = 10</span>, <span style='color:#16a085;'>completed = true</span></li>")
                .append("</ul><br>");

        tokens.append("<h3 style='color:#2980b9;'>💡 <b>Condicionais e Repetições:</b></h3>")
                .append("<ul>")
                .append("<li><b>T_COND_IF</b>: <span style='color:#c0392b;'>check</span><br><i>Exemplo:</i> <span style='color:#16a085;'>check (velocity &gt; 50) { ... }</span></li>")
                .append("<li><b>T_COND_ELSE</b>: <span style='color:#c0392b;'>checked</span><br><i>Exemplo:</i> <span style='color:#16a085;'>checked { ... }</span></li>")
                .append("<li><b>T_REP_FOR</b>: <span style='color:#c0392b;'>task</span><br><i>Exemplo:</i> <span style='color:#16a085;'>task (coin i = 0; i &lt; 5; i = i + 1) { ... }</span></li>")
                .append("</ul><br>");

        tokens.append("<h3 style='color:#2980b9;'>🚀 <b>Funções e Exceções:</b></h3>")
                .append("<ul>")
                .append("<li><b>T_EX_TRY</b>: <span style='color:#c0392b;'>play</span><br><i>Exemplo:</i> <span style='color:#16a085;'>play { ... }</span></li>")
                .append("<li><b>T_FUNC_DEF</b>: <span style='color:#c0392b;'>quest</span><br><i>Exemplo:</i> <span style='color:#16a085;'>quest $spawnEnemy() { ... }</span></li>")
                .append("</ul><br>");

        tokens.append("<h3 style='color:#2980b9;'>⚙️ <b>Valores e Variáveis do Sistema:</b></h3>")
                .append("<ul>")
                .append("<li><b>T_SYS_VAR</b>: DELTA, PATH, VERSION, APP_NAME</li>")
                .append("<li><b>T_SYS_FUNC</b>: SHOW_SCREEN, KILL_APP</li>")
                .append("</ul><br>");

        tokens.append("<h3 style='color:#2980b9;'>🔢 <b>Valores Literais:</b></h3>")
                .append("<ul>")
                .append("<li><b>T_VAL_BOOL</b>: <span style='color:#16a085;'>true</span>, <span style='color:#16a085;'>false</span></li>")
                .append("<li><b>T_VAL_INT</b>: <span style='color:#16a085;'>1</span>, <span style='color:#16a085;'>-1</span>, <span style='color:#16a085;'>576</span></li>")
                .append("<li><b>T_VAL_DOUBLE</b>: <span style='color:#16a085;'>2.0</span>, <span style='color:#16a085;'>1.2</span></li>")
                .append("</ul><br>");

        tokens.append("<h3 style='color:#2980b9;'>💬 <b>Outros:</b></h3>")
                .append("<ul>")
                .append("<li><b>T_COMMENT</b>: <span style='color:#7f8c8d;'>// comentário</span></li>")
                .append("<li><b>T_END_C</b>: <span style='color:#c0392b;'>;</span></li>")
                .append("<li><b>T_COMMA</b>: <span style='color:#c0392b;'>,</span></li>")
                .append("<li><b>T_DOT</b>: <span style='color:#c0392b;'>.</span></li>")
                .append("<li><b>T_PAR_OPEN</b>: <span style='color:#c0392b;'>(</span></li>")
                .append("<li><b>T_PAR_CLOSE</b>: <span style='color:#c0392b;'>)</span></li>")
                .append("<li><b>T_BRAC_OPEN</b>: <span style='color:#c0392b;'>{</span></li>")
                .append("<li><b>T_BRAC_CLOSE</b>: <span style='color:#c0392b;'>}</span></li>")
                .append("</ul><br>");

        tokens.append("</body></html>");

        // Cria e exibe a nova janela com os tokens
        TokenListFrame tokenListFrame = new TokenListFrame(tokens.toString());
        tokenListFrame.setVisible(true);
    }

    private void addToolBarButton(JToolBar toolBar, String text, String iconName, Runnable action) {
        JButton button = createStyledButton(text, iconName, new Color(126, 126, 126));
        button.addActionListener(e -> action.run());
        toolBar.add(button);
    }

    // Classe interna para exibir tokens
    private class TokenListFrame extends JFrame {
        public TokenListFrame(String tokens) {
            setTitle("Tokens Disponíveis");
            setSize(800, 800);
            setLocationRelativeTo(null);  // Centraliza a janela na tela

            JEditorPane tokenPane = new JEditorPane("text/html", tokens);
            tokenPane.setEditable(false);  // Impede edição do texto

            JScrollPane scrollPane = new JScrollPane(tokenPane);  // Adiciona uma barra de rolagem

            add(scrollPane, BorderLayout.CENTER);
        }
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

    private void compile() throws LexiconException, SyntaxException {
        String codigo = editorArea.getText();
        terminalArea.setText("");
        try {
            CMineLib lib = new CMineLib();
            terminalArea.setText(String.valueOf(lib.analyze(codigo)));

        } catch (LexiconException e) {
            LexiconException le = (LexiconException)e;

            terminalArea.append(String.format("Erro Léxico (%s): '%s' - Linha: %d - Coluna: %d%n", le.getLexiconExceptionName(), le.getExpression(), le.getLine(), le.getColumn()));
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