package gui;

import com.cmine.lexicon.LexiconAnalyzer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompiladorUI extends JFrame {
    private final JTextArea editorArea;
    private final JTextArea terminalArea;

    public CompiladorUI() {
        setTitle("Compilador");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criando componentes
        editorArea = new JTextArea();
        terminalArea = new JTextArea();
        terminalArea.setEditable(false);
        JButton compilarButton = new JButton("Compilar");

        // Layout
        setLayout(new BorderLayout());

        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                new JScrollPane(editorArea),
                new JScrollPane(terminalArea));
        splitPane.setResizeWeight(0.7);

        add(splitPane, BorderLayout.CENTER);
        add(compilarButton, BorderLayout.SOUTH);

        // Listener do botão
        compilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compilar();
            }
        });
    }

    private void compilar() {
        String codigo = editorArea.getText();
        terminalArea.setText(""); // Limpa o terminal antes de cada compilação

        try {
            // Aqui você chama o LexiconAnalyzer
            LexiconAnalyzer analyzer = new LexiconAnalyzer();
            java.util.List<com.cmine.token.Token> tokens = analyzer.analyze(new java.io.BufferedReader(new java.io.StringReader(codigo)));

            // Exibe os tokens no terminal
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CompiladorUI().setVisible(true);
            }
        });
    }
}