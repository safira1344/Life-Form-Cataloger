import Models.Classes.Cordados.Peixes.PeixeCartilaginoso;
import Models.Classes.Cordados.Peixes.Peixe;
import Models.Filos.Animal.Cordado;
import Models.Reinos.Animal;

public class Main {
    // Este projeto é um catalogador de seres vivos, onde é possível cadastrar e buscar seres vivos. Construído em Java e seguindo o paradigma de orientação a objetos.

    public static void main(String[] args) {
        PeixeCartilaginoso bruxa = new PeixeCartilaginoso();
        // Compara a classe com a instância

        System.out.println(
                "O peixe cartilaginoso bruxa é um tipo de Peixe Cartilaginoso? " + (bruxa instanceof PeixeCartilaginoso));

        System.out.println("O peixe cartilaginoso bruxa é um tipo de Peixe? " + (bruxa instanceof Peixe));

        System.out.println("O peixe cartilaginoso bruxa é um tipo de Cordado? " + (bruxa.getFilo() instanceof Cordado));

        System.out.println("O peixe cartilaginoso bruxa é um tipo de Animal? " + (bruxa.getFilo().getReino() instanceof Animal));
    }
}