package Frontend;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Frontend.Insert.InsertPage;
import Frontend.Search.ReinosPage;
import Frontend.fonts.Fonts;

// Opções
// 1 Buscar seres vivos
// 2 Cadastrar seres vivos
// 3 Sobre o projeto
// 4 Sair

public class HomePage extends JFrame {
    private int screenWidth = 800;
    private int screenHeight = 600;

    public HomePage() {
        super("Catalogador de Seres Vivos");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(screenWidth, screenHeight);
        super.setResizable(false);

        JLabel title = new JLabel("Catalogador de Seres Vivos");
        title.setFont(Fonts.titleFont);
        title.setBounds((screenWidth / 2) - 200, 25, 400, 60);
        super.add(title);

        // Botões
        int buttonWidth = 200;
        int buttonHeight = 30;
        int positionX = (screenWidth / 2) - (buttonWidth / 2);

        JButton searchButton = new JButton("Buscar seres vivos");
        searchButton.setBounds(positionX, 100, buttonWidth, buttonHeight);
        super.add(searchButton);

        JButton registerButton = new JButton("Cadastrar seres vivos");
        registerButton.setBounds(positionX, 150, buttonWidth, buttonHeight);
        super.add(registerButton);

        JButton aboutButton = new JButton("Sobre o projeto");
        aboutButton.setBounds(positionX, 200, buttonWidth, buttonHeight);
        super.add(aboutButton);

        JButton exitButton = new JButton("Sair");
        exitButton.setBounds(positionX, 250, buttonWidth, buttonHeight);
        super.add(exitButton);

        // Eventos dos botões
        searchButton.addActionListener(e -> searchButtonListener());
        registerButton.addActionListener(e -> registerButtonListener());
        aboutButton.addActionListener(e -> aboutButtonListener());
        exitButton.addActionListener(e -> super.dispose());

        super.setLayout(null);

        super.setVisible(true);

    }

    public void searchButtonListener() {
        super.dispose();
        new ReinosPage();
    }

    public void registerButtonListener() {
        super.dispose();
        new InsertPage();
    }

    public void aboutButtonListener() {
        JDialog dialog = new JDialog();
        dialog.setTitle("Sobre o projeto");
        dialog.setSize(400, 400);
        dialog.setResizable(false);
        dialog.setLayout(null);

        JLabel title = new JLabel("Catalogador de Seres Vivos");
        title.setBounds(50, 25, 300, 60);
        dialog.add(title);

        JLabel description = new JLabel(
                "<html> Este projeto é um catalogador de seres vivos,<br> onde é possível cadastrar e buscar seres vivos. Construído em Java e seguindo o paradigma de orientação a objetos. </html>");

        description.setBounds(50, 100, 300, 100);
        dialog.add(description);

        JLabel creator = new JLabel(
                "<html>Desenvolvido por: <br>Fernanda Mirely Barbosa Souza<br> Amanda de Jesus Melo</html>");
        creator.setBounds(50, 200, 300, 100);
        dialog.add(creator);

        dialog.setVisible(true);
    }

}
