package Frontend.Search;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Frontend.fonts.Fonts;
import Models.Classes.Classe;

public class ClassesPage extends JFrame {
    private int screenWidth = 800;
    private int screenHeight = 600;

    private int buttonWidth = 200;
    private int buttonHeight = 30;
    private int positionX = (screenWidth / 2) - (buttonWidth / 2);
    private int positionY = 100;

    public ClassesPage(String filo) {
        super("Catalogador de Seres Vivos - Classes");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(screenWidth, screenHeight);
        super.setResizable(false);
        super.setLayout(null);

        // Titulo
        String titleText = "Escolha uma classe do filo " + filo;
        int titleWidth = 800;
        int titleHeight = 60;
        int titlePositionX = (screenWidth / 2) - (titleWidth / 2);
        int titlePositionY = 25;
        JLabel title = new JLabel(titleText);
        title.setBounds(titlePositionX, titlePositionY, titleWidth, titleHeight);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(Fonts.titleFont);
        super.add(title);

        // Botões
        switch (filo) {
            case "Artropodes":
                gerarBotoesClassesFiloArtropodes();
                break;
            case "Cnidarios":
                gerarBotoesClassesFiloCnidarios();
                break;
            case "Cordados":
                gerarBotoesClassesFiloCordados();
                break;
            case "Equinodermos":
                gerarBotoesClassesFiloEquinodermos();
                break;
            case "Moluscos":
                gerarBotoesClassesFiloMoluscos();
                break;
            case "Poriferos":
                gerarBotoesClassesFiloPoriferos();
                break;

            default:
                System.out.println("Filo não encontrado");
                break;

        }

        super.setVisible(true);
    }

    private void buttonAction(String classe) {
        super.dispose();
        new EspeciesPage(classe);
    }

    private void createButton(String classe) {
        JButton button = new JButton(classe);
        button.setBounds(positionX, positionY, buttonWidth, buttonHeight);
        button.addActionListener(e -> buttonAction(classe));
        super.add(button);
        positionY += 50;
    }

    private void gerarBotoesClassesFiloArtropodes() {
        for (String classe : Classe.classesFiloArtropodes) {
            createButton(classe);
        }
    }

    private void gerarBotoesClassesFiloCnidarios() {
        for (String classe : Classe.classesFiloCnidarios) {
            createButton(classe);
        }
    }

    private void gerarBotoesClassesFiloCordados() {
        for (String classe : Classe.classesFiloCordados) {
            createButton(classe);
        }
    }

    private void gerarBotoesClassesFiloEquinodermos() {
        for (String classe : Classe.classesFiloEquinodermos) {
            createButton(classe);
        }
    }

    private void gerarBotoesClassesFiloMoluscos() {
        for (String classe : Classe.classesFiloMoluscos) {
            createButton(classe);
        }
    }

    private void gerarBotoesClassesFiloPoriferos() {
        for (String classe : Classe.classesFiloPoriferos) {
            createButton(classe);
        }
    }
}