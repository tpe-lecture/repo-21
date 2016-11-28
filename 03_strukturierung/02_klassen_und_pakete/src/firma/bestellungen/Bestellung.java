package firma.bestellungen;

import firma.stammdaten.Kunde;

/**
 * Eine Bestellung.
 */
public class Bestellung {

    /** Kunde, der die Bestellung aufgegeben hat. */
    @SuppressWarnings("unused")
    private Kunde kunde;

    /** Einzelnen Positionen der Bestellung. */
    @SuppressWarnings("unused")
    private Bestellposition[] positionen;
}
