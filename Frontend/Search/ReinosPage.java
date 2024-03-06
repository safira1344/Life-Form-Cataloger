package Frontend.Search;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Frontend.fonts.Fonts;
import Models.Reinos.Reino;

public class ReinosPage extends JFrame {
    private int screenWidth = 800;
    private int screenHeight = 600;

    public ReinosPage() {
        super("Catalogador de Seres Vivos - Reinos");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(screenWidth, screenHeight);
        super.setResizable(false);
        super.setLayout(null);

        // Titulo
        JLabel title = new JLabel("Escolha um reino");
        title.setBounds((screenWidth / 2) - 200, 25, 400, 60);
        title.setFont(Fonts.titleFont);
        title.setHorizontalAlignment(JLabel.CENTER);
        super.add(title);

        // Botões
        int buttonWidth = 200;
        int buttonHeight = 30;
        int positionX = (screenWidth / 2) - (buttonWidth / 2);
        int positionY = 100;

        for (String reino : Reino.reinos) {
            JButton button = new JButton(reino);
            button.setBounds(positionX, positionY, buttonWidth, buttonHeight);
            button.addActionListener(e -> buttonAction(reino));
            super.add(button);
            positionY += 50;
        }

        super.setVisible(true);
    }

    private void buttonAction(String reino) {
        super.dispose();
        new FilosPage(reino);
    }

}
