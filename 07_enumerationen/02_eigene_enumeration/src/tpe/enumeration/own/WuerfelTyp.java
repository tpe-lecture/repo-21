package tpe.enumeration.own;

/**
 *
 * @author Luca
 *
 */
public enum WuerfelTyp {
    /**
     *
     */
    D4(4), D6(6), D8(8), D10(10), D12(12), D20(20);
    private final int seitenZahl;

    /**
     *
     * @param seiten anzahl der Seiten des Würfels
     */
    WuerfelTyp(int seiten) {
        this.seitenZahl = seiten;
    }

    /**
     *
     * @return anzahl der Seiten
     */
    public int getSeiten() {
        return this.seitenZahl;
    }

    /**
     *
     * @return den druchschnittwert für diesen Würfel
     */
    public double average() {
        return (this.seitenZahl * 0.5) + 0.5;

    }
}
