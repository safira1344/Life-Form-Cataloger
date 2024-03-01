package Models.Reinos;
//Reinos: Plantae, Animalia, Fungi, Protista, Monera

public abstract class Reino {
    private String nomeCientifico;

    public Reino(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

}
