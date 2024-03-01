package Models.Filos;

import Models.Reinos.Reino;

/**
 * Filo
 */

public abstract class Filo {
    private Reino reino;

    protected Filo(Reino reino) {
        this.reino = reino;
    }

    public Reino getReino() {
        return reino;
    }
}
