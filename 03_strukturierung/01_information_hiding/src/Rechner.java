
/**
 * Ein einfacher Taschenrechner.
 */
public class Rechner {

    /** Ergebnis des Taschenrechners. */
    private double wert;

    /**
     * Getter Methode für wert.
     *
     * @return wert
     */
    public double getWert() {
        return wert;
    }

    /** Speicher des Taschenrechners. */
    private double speicher;

    /**
     * getter Methode von speicher.
     *
     * @return speicher
     */
    public double getSpeicher() {
        return speicher;
    }

    /**
     * Addiert zwei Wert und schreibt das Ergebnis in die Variable {@code wert}.
     *
     * @param a erster Operand.
     * @param b zweiter Operand.
     */
    public void addiere(double a, double b) {
        wert = a + b;
    }

    /**
     * Subtrahiert zwei Wert und schreibt das Ergebnis in die Variable
     * {@code wert}.
     *
     * @param a erster Operand.
     * @param b zweiter Operand.
     */
    public void subtrahiere(double a, double b) {
        wert = a - b;
    }

    /**
     * Multipliziert zwei Wert und schreibt das Ergebnis in die Variable
     * {@code wert}.
     *
     * @param a erster Operand.
     * @param b zweiter Operand.
     */
    public void multipliziere(double a, double b) {
        wert = a * b;
    }

    /**
     * Speichert den aktuellen Wert in der Variable {@speicher}.
     */
    public void speichern() {
        speicher = wert;
    }
}
