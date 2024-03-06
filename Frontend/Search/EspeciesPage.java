package Frontend.Search;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Frontend.fonts.Fonts;

public class EspeciesPage extends JFrame {
    // Extrair as especies de um arquivo de texto
    private static final String[] especies = { "Cachorro", "Gato", "Papagaio", "Pato", "Galinha", "Pomba", "Pato",
            "Galinha", "Pomba", "Pato", "Galinha", "Pomba", "Pato", "Galinha", "Pomba", "Pato", "Galinha", "Pomba",
            "Pato", "Galinha", "Pomba", "Pato", "Galinha", "Pomba", "Pato", "Galinha", "Pomba", "Pato", "Galinha",
            "Pomba", "Pato", "Galinha", "Pomba", "Pato", "Galinha", "Pomba", "Pato", "Galinha", "Pomba", "Pato",
            "Galinha", "Pomba", "Pato", "Galinha", "Pomba", "Pato", "Galinha", "Pomba", "Pato", "Galinha", "Pomba",
            "Pato", "Galinha", "Pomba", "Pato"
    };
    private int screenWidth = 800;
    private int screenHeight = 600;

    public EspeciesPage(String classe) {
        super("Catalogador de Seres Vivos - Especies");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(screenWidth, screenHeight);
        super.setResizable(false);
        super.setLayout(null);

        // Titulo
        String titleText = "Lista de especies da classe " + classe;
        int titleWidth = 800;
        int titleHeight = 60;
        int titlePositionX = (screenWidth / 2) - (titleWidth / 2);
        int titlePositionY = 25;
        JLabel title = new JLabel(titleText);
        title.setBounds(titlePositionX, titlePositionY, titleWidth, titleHeight);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(Fonts.titleFont);
        super.add(title);

        gerarListaEspecies();

        super.setVisible(true);
    }

    private void gerarListaEspecies() {
        // Criar um painel para conter a lista
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Criar a lista de espécies
        JList<String> listaEspecies = new JList<>(especies);

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

}
