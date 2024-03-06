package Frontend;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
        registerButton.addActionListener(e -> System.out.println("registerButtonListener"));
        aboutButton.addActionListener(e -> System.out.println("aboutButtonListener"));
        exitButton.addActionListener(e -> super.dispose());

        // ImageIcon malu = new ImageIcon("Frontend/imgs/malu.jpeg");
        // JLabel maluLabel = new JLabel(malu);
        // maluLabel.setBounds(0, 0, 100, 100);
        // super.add(maluLabel);

        super.setLayout(null);

        super.setVisible(true);

    }

    public void searchButtonListener() {
        super.dispose();
        new ReinosPage();
    }

    public void registerButtonListener() {
        System.out.println("registerButtonListener");
    }

    public void aboutButtonListener() {
        System.out.println("aboutButtonListener");
    }

}
