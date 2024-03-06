package Models.Classes;

import Models.Filos.Filo;

public abstract class Classe {

    //filos do reino animal

    public static final String[] classesFiloArtropodes = { "Aracnideos", "Crustaceos", "Dipteros", "Himenopteros",
            "Lepidopteros", "Odonatos", "Ortopteros" };
    public static final String[] classesFiloCnidarios = { "Antozoarios", "Hidrozoarios", "Cifozoarios" };
    public static final String[] classesFiloCordados = { "Agnatos", "Condrictes", "Osteictes", "Anfibios", "Repteis",
            "Aves", "Mamiferos" };
    public static final String[] classesFiloEquinodermos = { "Asteroides", "Equinoides", "Holoturideos", "Ofiuroides" };
    public static final String[] classesFiloMoluscos = { "Bivalves", "Gasteropodes", "Cefalopodes" };
    public static final String[] classesFiloPoriferos = { "Calcareas", "Hexactinelidas", "Demosponjas" };

    //filos do reino vegetal

    public static final String[] classesFiloAngiosperma = { "Monocotiledoneas", "Dicotiledoneas" };
    public static final String[] classesFiloBriofita = { "Hepaticas", "Musgos" };
    public static final String[] classesFiloGimnosperma = { "Coniferas", "Cicadofitas", "Gnetofitas", "Ginkgofitas" };
    public static final String[] classesFiloPteridofita = { "Licopodios", "Equisetos", "Fernas" };

    //filos do reino fungi

    public static final String[] classesFiloAscomycotas = { "Leveduras", "Bolores", "Fungos" };
    public static final String[] classesFiloBasidiomycotas = { "Cogumelos", "Fungos" };
    public static final String[] classesFiloZygomycotas = { "Fungos" };


    //filos do reino protista

    public static final String[] classesFiloAlgas = { "Diatomeas", "Dinoflagelados", "Euglenofitas", "Clorofitas", "Rodofitas" };
    public static final String[] classesFiloProtozoarios = { "Sarcomastigoforos", "Ciliados", "Apicomplexos", "Esporozoarios" };


    //filos do reino monera

    public static final String[] classesFiloArqueias = { "Metanogenicas", "Termoacidofilas", "Halofilas" };
    public static final String[] classesFiloBacterias = { "Cianobacterias", "Proteobacterias", "Firmicutes", "Actinobacterias" };


    

    
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
