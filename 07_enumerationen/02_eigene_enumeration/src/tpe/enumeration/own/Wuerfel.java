package tpe.enumeration.own;

import java.util.Random;

/**
 * Ein einfacher Würfel.
 */
public class Wuerfel {

    /** Zufallszahlengenerator. */
    private final Random rnd = new Random();

    /** Anzahl der Seiten des Würfels. */
    private final WuerfelTyp typ;

    /**
     * Einen neuen Würfel anlegen.
     *
     * @param wuerfeltyp Typ des Würfels.
     */
    public Wuerfel(WuerfelTyp wuerfeltyp) {
        this.typ = wuerfeltyp;
    }

    /**
     * Den Würfel werfen.
     *
     * @return Ergebnis des Wurfes.
     */
    public int roll() {
        return rnd.nextInt(typ.getSeiten()) + 1;
    }
}
