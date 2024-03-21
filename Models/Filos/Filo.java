package Models.Filos;

import Models.Reinos.Reino;

/**
 * Filo
 */

public abstract class Filo {

    public static final String[] filosReinoAnimal = { "Artropodes", "Cnidarios", "Cordados", "Equinodermos", "Moluscos",
            "Poriferos" };
    public static final String[] filosReinoVegetal = { "Angiospermas", "Briofitas", "Gimnospermas", "Pteridofitas" };
    public static final String[] filosReinoFungi = { "Ascomycotas", "Basidiomycotas", "Zygomycotas" };
    public static final String[] filosReinoProtista = { "Algas", "Protozoarios" };
    public static final String[] filosReinoMonera = { "Arqueias", "Bacterias" };

    private Reino reino;

    protected Filo(Reino reino) {
        this.reino = reino;
    }

    public Reino getReino() {
        return reino;
    }
}
