package Frontend.Search;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Frontend.fonts.Fonts;
import Models.Filos.Filo;

public class FilosPage extends JFrame {
    private int screenWidth = 800;
    private int screenHeight = 600;

    private int buttonWidth = 200;
    private int buttonHeight = 30;
    private int positionX = (screenWidth / 2) - (buttonWidth / 2);
    private int positionY = 100;

    public FilosPage(String reino) {
        super("Catalogador de Seres Vivos - Filos");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(screenWidth, screenHeight);
        super.setResizable(false);
        super.setLayout(null);

        // Titulo
        String titleText = "Escolha um filo do reino " + reino;
        int titleWidth = 800;
        int titleHeight = 60;
        int titlePositionX = (screenWidth / 2) - (titleWidth / 2);
        int titlePositionY = 25;
        JLabel title = new JLabel(titleText);
        title.setFont(Fonts.titleFont);
        title.setBounds(titlePositionX, titlePositionY, titleWidth, titleHeight);
        title.setHorizontalAlignment(JLabel.CENTER);
        super.add(title);

        // Botões
        switch (reino) {
            case "Animal":
                gerarBotoesFilosReinoAnimal();
                break;
            case "Vegetal":
                gerarBotoesFilosReinoVegetal();
                break;
            case "Fungi":
                gerarBotoesFilosReinoFungi();
                break;
            case "Protista":
                gerarBotoesFilosReinoProtista();
                break;
            case "Monera":
                gerarBotoesFilosReinoMonera();
                break;

            default:
                break;

        }

        super.setVisible(true);
    }

    private void createButton(String filo) {
        JButton button = new JButton(filo);
        button.setBounds(positionX, positionY, buttonWidth, buttonHeight);
        button.addActionListener(e -> buttonAction(filo));
        super.add(button);
        positionY += 50;
    }

    private void buttonAction(String filo) {
        super.dispose();
        // new ClassesPage(filo);
        new EspeciesPage(filo);
    }

    private void gerarBotoesFilosReinoAnimal() {
        for (String filo : Filo.filosReinoAnimal) {
            createButton(filo);
        }
    }

    private void gerarBotoesFilosReinoVegetal() {
        for (String filo : Filo.filosReinoVegetal) {
            createButton(filo);
        }
    }

    private void gerarBotoesFilosReinoFungi() {
        for (String filo : Filo.filosReinoFungi) {
            createButton(filo);
        }
    }

    private void gerarBotoesFilosReinoProtista() {
        for (String filo : Filo.filosReinoProtista) {
            createButton(filo);
        }
    }

    private void gerarBotoesFilosReinoMonera() {
        for (String filo : Filo.filosReinoMonera) {
            createButton(filo);
        }
    }

}
