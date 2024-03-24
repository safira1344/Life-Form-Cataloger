package Frontend.Insert;

import Models.Especies.Especie;
import Models.Filos.Filo;
import Models.Reinos.Animal;
import Backend.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Frontend.HomePage;
import Frontend.fonts.Fonts;

public class InsertPage extends JFrame {

    private int screenWidth = 800;
    private int screenHeight = 600;
    private String filoSelected = "";

    public InsertPage() {

        super("Cadastro de especies");
        super.setLayout(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(screenWidth, screenHeight);

        // title centered top
        JLabel title = new JLabel("Cadastro de especies");
        title.setFont(Fonts.titleFont);
        int titleWidth = title.getFontMetrics(title.getFont()).stringWidth(title.getText());
        title.setBounds((screenWidth / 2) - (titleWidth / 2), 20, titleWidth, 50);
        super.add(title);

        // Filo selected
        JLabel filoLabel = new JLabel("Filo selecionado: ");
        filoLabel.setBounds((screenWidth / 2) - (200 / 2), 150, 200, 50);

        // JPopupMenu to select the type of species and respective filos
        JPopupMenu popupMenu = new JPopupMenu();

        JMenu menuReinoAnimal = new JMenu("Animal");
        for (String filo : Filo.filosReinoAnimal) {
            addMenuItem(menuReinoAnimal, filo, filoLabel);
        }
        popupMenu.add(menuReinoAnimal);

        JMenu menuReinoFungi = new JMenu("Fungi");
        for (String filo : Filo.filosReinoFungi) {
            addMenuItem(menuReinoFungi, filo, filoLabel);
        }
        popupMenu.add(menuReinoFungi);

        JMenu menuReinoMonera = new JMenu("Monera");
        for (String filo : Filo.filosReinoMonera) {
            addMenuItem(menuReinoMonera, filo, filoLabel);
        }
        popupMenu.add(menuReinoMonera);

        JMenu menuReinoProtista = new JMenu("Protista");
        for (String filo : Filo.filosReinoProtista) {
            addMenuItem(menuReinoProtista, filo, filoLabel);
        }
        popupMenu.add(menuReinoProtista);

        JMenu menuReinoVegetal = new JMenu("Vegetal");
        for (String filo : Filo.filosReinoVegetal) {
            addMenuItem(menuReinoVegetal, filo, filoLabel);
        }
        popupMenu.add(menuReinoVegetal);

        // button to open the popup menu
        JButton selectTypeButton = new JButton("Selecione o tipo de especie");
        selectTypeButton.setBounds((screenWidth / 2) - (200 / 2), 100, 200, 50);
        selectTypeButton.addActionListener(e -> popupMenu.show(selectTypeButton, 0, selectTypeButton.getHeight()));
        super.add(selectTypeButton);

        // Filo selected
        super.add(filoLabel);

        // text fields
        JTextField name = new JTextField("Nome");
        name.setBounds((screenWidth / 2) - (200 / 2), 200, 200, 50);
        super.add(name);

        JTextField nameCientifico = new JTextField("Nome cientifico");
        nameCientifico.setBounds((screenWidth / 2) - (200 / 2), 250, 200, 50);
        super.add(nameCientifico);

        JTextField description = new JTextField("Descricao");
        description.setBounds((screenWidth / 2) - (200 / 2), 300, 200, 50);
        super.add(description);

        // button to save the species
        JButton save = new JButton("Salvar");
        save.setBounds((screenWidth / 2) - (200 / 2), 350, 200, 50);
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Se não tiver selecionado o filo
                if (filoSelected.equals("")) {
                    JOptionPane.showMessageDialog(null, "Selecione o tipo de especie");
                    return;
                }

                // Se não tiver preenchido todos os campos
                if (name.getText().equals("Nome") || nameCientifico.getText().equals("Nome cientifico")
                        || description.getText().equals("Descricao") || name.getText().equals("")
                        || nameCientifico.getText().equals("") || description.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                    return;
                }

                String nome = name.getText();
                String nomeCientifico = nameCientifico.getText();
                String descricao = description.getText();

                Especie especie = new Especie(nome, nomeCientifico, descricao);
                Backend.inserirEspecie("Backend/data/" + filoSelected + ".txt", especie);

                JOptionPane.showMessageDialog(null, "Especie cadastrada com sucesso");

                name.setText("Nome");
                nameCientifico.setText("Nome cientifico");
                description.setText("Descricao");

                filoSelected = "";
                filoLabel.setText("Filo selecionado: ");

                
            }
        });

        JButton backButton = new JButton("Voltar");
        backButton.setBounds(300, 500, 200, 30);
        super.add(backButton);
        backButton.addActionListener(e -> buttonHomePage());

        super.add(save);

        super.setVisible(true);
    }

    private void selectFilo(String filo, JLabel filoLabel) {
        filoSelected = filo;
        filoLabel.setText("Filo selecionado: " + filo);
    }

    private void addMenuItem(JMenu menuReino, String filo, JLabel filoLabel) {
        JMenuItem filoItem = new JMenuItem(filo);
        filoItem.addActionListener(e -> selectFilo(filo, filoLabel));
        menuReino.add(filoItem);
    }

    private void buttonHomePage() {
        super.dispose();
        new HomePage();
    }

}