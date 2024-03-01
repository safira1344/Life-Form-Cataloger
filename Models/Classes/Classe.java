package Models.Classes;

import Models.Filos.Filo;

public abstract class Classe {

    private Filo filo;
    private String nomeCientifico;

    protected Classe(Filo filo, String nomeCientifico) {
        this.filo = filo;
        this.nomeCientifico = nomeCientifico;
    }

    public Filo getFilo() {
        return filo;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

}
