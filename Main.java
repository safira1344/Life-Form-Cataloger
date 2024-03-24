import java.util.List;

import javax.swing.SwingUtilities;

import Backend.Backend;
import Frontend.HomePage;
import Frontend.Insert.InsertPage;
import Models.Especies.Especie;

public class Main {
    // Este projeto é um catalogador de seres vivos, onde é possível cadastrar e
    // buscar seres vivos. Construído em Java e seguindo o paradigma de orientação a
    // objetos.

    public static void main(String[] args) {
        // Chamar HomePage
        SwingUtilities.invokeLater(HomePage::new);

    }
}