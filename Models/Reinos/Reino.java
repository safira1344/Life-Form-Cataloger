package Models.Reinos;
//Reinos: Plantae, Animalia, Fungi, Protista, Monera

public abstract class Reino {
    
    public static final String[] reinos = { "Animal", "Fungi", "Vegetal", "Protista", "Monera" };

    private String nomeCientifico;

    public Reino(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

}
