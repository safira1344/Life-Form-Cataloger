package Frontend.Search;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Backend.Backend;
import Frontend.HomePage;
import Frontend.fonts.Fonts;
import Models.Especies.Especie;

public class EspeciesPage extends JFrame {
    // Extrair as especies de um arquivo de texto

    private int screenWidth = 800;
    private int screenHeight = 600;

    public EspeciesPage(String filo) {
        super("Catalogador de Seres Vivos - Especies");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(screenWidth, screenHeight);
        super.setResizable(false);
        super.setLayout(null);

        // Titulo
        String titleText = "Lista de especies do filo " + filo;
        int titleWidth = 800;
        int titleHeight = 60;
        int titlePositionX = (screenWidth / 2) - (titleWidth / 2);
        int titlePositionY = 25;
        JLabel title = new JLabel(titleText);
        title.setBounds(titlePositionX, titlePositionY, titleWidth, titleHeight);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(Fonts.titleFont);
        super.add(title);

        JButton backButton = new JButton("Voltar");
        backButton.setBounds(300, 500, 200, 30);
        super.add(backButton);
        backButton.addActionListener(e -> buttonHomePage());

        gerarListaEspecies(filo);

        super.setVisible(true);
    }

    private void gerarListaEspecies(String filo) {
        // Criar um painel para conter a lista
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        String nomeArquivo = "Backend/data/" + filo + ".txt";

        List<Especie> especies = Backend.getListaEspecies(nomeArquivo);
        List<String> especiesRetornadas = new ArrayList<>();

        for (Especie especie : especies) {
            especiesRetornadas.add(especie.getNome());
        }

        // Criar a lista de espécies
        JList<String> listaEspecies = new JList<>(especiesRetornadas.toArray(new String[0]));

        // add action listener to the list
        listaEspecies.addListSelectionListener(e -> {
            // Se a seleção não estiver mudando entre seleção e desseleção
            if (!e.getValueIsAdjusting()) {
                buttonAction(listaEspecies.getSelectedValue(), filo);
            }
        });

        // Adicionar a lista a um JScrollPane para torná-la rolável
        JScrollPane scrollPane = new JScrollPane(listaEspecies);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Adicionar o JScrollPane ao painel
        panel.add(scrollPane, BorderLayout.CENTER);

        // Definir as dimensões e a posição do painel
        int panelWidth = 400;
        int panelHeight = 400;
        int panelPositionX = (screenWidth / 2) - (panelWidth / 2);
        int panelPositionY = 100;
        panel.setBounds(panelPositionX, panelPositionY, panelWidth, panelHeight);

        // Adicionar o painel ao JFrame
        super.add(panel);

    }

    private void buttonHomePage() {
        super.dispose();
        new HomePage();
    }

    public void buttonAction(String especie, String filo) {
        showPopupInfo(especie, filo);
    }

    private void showPopupInfo(String especie, String filo) {
        // Mostrar informações da espécie
        Especie especieRetornada = Backend.buscarEspecie("Backend/data/" + filo + ".txt", especie);

        String nome = especieRetornada.getNome();
        String nomeCientifico = especieRetornada.getNomeCientifico();
        String descricao = especieRetornada.getDescricao();

        JDialog dialog = new JDialog();
        dialog.setTitle("Informações da espécie");
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setLayout(null);

        JLabel infoLabel = new JLabel("<html>Nome: " + nome + "<br>Nome científico: " + nomeCientifico
                + "<br>Descrição: " + descricao + "</html>");

        dialog.add(infoLabel);
        infoLabel.setBounds(50, 50, 300, 200);

        dialog.setVisible(true);

        dialog.setSize(400, 400);

    }
}