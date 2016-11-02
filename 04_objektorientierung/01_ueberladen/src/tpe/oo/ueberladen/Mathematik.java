package tpe.oo.ueberladen;

/**
 * Einfache Hilfsklasse mit mathematischen Methoden.
 */
public final class Mathematik {

    /**
     * Konstruktor.
     */
    private Mathematik() {
    }

    /**
     * Bestimmt das größere Element von beiden.
     *
     * @param zahlEins erste Zahl die übergeben wird
     * @param zahlZwei zwete Zahl die übergeben wird
     * @return die Größte Zahl der beiden
     */
    public static int max(int zahlEins, int zahlZwei) {
        if (zahlEins > zahlZwei) {
            return zahlEins;
        }
        else {
            return zahlZwei;
        }
    }

    /**
     * Überladene Mtehote für 3 Int zahlen.
     *
     * @param zahlEins erste übergebene Zahl
     * @param zahlZwei zweite übergebene Zahl
     * @param zahlDrei dritte übergebene Zahl
     * @return die Größte der drei Zahlen
     */
    public static int max(int zahlEins, int zahlZwei, int zahlDrei) {
        if (max(zahlEins, zahlZwei) > zahlDrei) {
            return max(zahlEins, zahlZwei);
        }
        else {
            return zahlDrei;
        }
    }

    /**
     * Überldene Methode die für Vier Int Zahlen funktioniert.
     *
     * @param zahlEins erste übergebene Zahl
     * @param zahlZwei zweite übergebene Zahl
     * @param zahlDrei dritte übergebene Zahl
     * @param zahlVier vierte übergebene Zahl
     * @return die Größte der vier Zahlen
     */
    public static int max(int zahlEins, int zahlZwei, int zahlDrei,
            int zahlVier) {
        if (max(zahlEins, zahlZwei, zahlDrei) > zahlVier) {
            return max(zahlEins, zahlZwei, zahlDrei);
        }
        else {
            return zahlVier;
        }
    }
}
