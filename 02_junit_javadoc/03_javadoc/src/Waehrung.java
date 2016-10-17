/**
 *
 * @author Luca Schilling
 * Verwaltet eine bestimmte Währung
 */
public class Waehrung {

    /**
     * Wechselkurs zum Dollar.
     */
    private final int kurs;

    /**
     * Name der Währung (z.B. EURO).
     */
    private final String name;

    /**
     * Kürzel der Währung (z.B. €).
     */
    private final String kuerzel;

    /**
     * Gibt die genauigkeit bei der Währungsrechnung an.
     */
    private static final long TEILER = 10000;

    /**
     * Erzeugt ein neues Objekt.
     *
     * @param name Name der Währung (z.B. EURO).
     * @param kuerzel Kürzel der Währung (z.B. €).
     * @param kurs Wechselkurs zum Dollar.
     */
    public Waehrung(String name, String kuerzel, double kurs) {
        this.kurs = (int) (kurs * TEILER);
        this.name = name;
        this.kuerzel = kuerzel;
    }

    /**
     * Rechnet die übergebene Währung mit Betrag in eine neue um.
     *
     * @param betrag Betrag der umzurechnenden Währung
     * @param toWaehrung Gibt an was die Zielwährung sein soll
     * @return Betrag der umgerechneten Währung
     */
    public long umrechnen(long betrag, Waehrung toWaehrung) {
        return betrag * kurs / toWaehrung.kurs;
    }

    /**
     * Getter methode für kurs.
     *
     * @return aktueller Kurs
     */
    public int getKurs() {
        return kurs;
    }

    /**
     * Getter methode für name.
     *
     * @return name der Währung
     */
    public String getName() {
        return name;
    }

    /**
     * Getter methode für kuerzel.
     *
     * @return kürzel der Währung
     */
    public String getKuerzel() {
        return kuerzel;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [%s] 1 %s = %.4f %s", name, kuerzel, "$",
                kurs / (double) TEILER, kuerzel);
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + kurs;
        result = prime * result + ((kuerzel == null) ? 0 : kuerzel.hashCode());
        return result;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Waehrung other = (Waehrung) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!name.equals(other.name)) {
            return false;
        }
        if (kurs != other.kurs) {
            return false;
        }
        if (kuerzel == null) {
            if (other.kuerzel != null) {
                return false;
            }
        }
        else if (!kuerzel.equals(other.kuerzel)) {
            return false;
        }
        return true;
    }
}
