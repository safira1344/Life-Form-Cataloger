package Models.Classes.Cordados.Peixes;

import Models.Classes.Classe;
import Models.Filos.Animal.Cordado;

/**
 * Peixe
 */
public abstract class Peixe extends Classe {

    public Peixe(String nomeCientifico) {
        super(new Cordado(), nomeCientifico);
    }

}