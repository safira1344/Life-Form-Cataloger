import java.util.List;

import javax.swing.SwingUtilities;

import Backend.Backend;
import Frontend.HomePage;
import Models.Especies.Especie;

public class Main {
    // Este projeto é um catalogador de seres vivos, onde é possível cadastrar e
    // buscar seres vivos. Construído em Java e seguindo o paradigma de orientação a
    // objetos.

    public static void main(String[] args) {
        // Chamar HomePage
        SwingUtilities.invokeLater(HomePage::new);
        List<String> cordados = Backend.lerLinhasDeArquivo("Backend/data/cordados.txt");
        for (String cordado : cordados) {
            System.out.println(cordado);
        }
        
        List<Especie> especieRetornada = Backend.getListaEspecies("Backend/data/Angiospermas.txt");
        for (Especie especie : especieRetornada) {
            System.out.println(especie.getNome());
            System.out.println(especie.getNomeCientifico());
            System.out.println(especie.getDescricao());
        }
    }
}