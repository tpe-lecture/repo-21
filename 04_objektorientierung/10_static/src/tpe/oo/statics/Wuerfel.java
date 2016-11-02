package tpe.oo.statics;

import java.util.Random;

/**
 * Ein einfacher Würfel.
 */
public class Wuerfel {

    /** Häufigkeit der Werte. */
    private static int[] haeufigkeit = new int[6];

    /** Zufallsgenerator. */
    private Random random = new Random();

    /**
     * Bestimmt den nächsten Wurf.
     *
     * @return der Wurf.
     */
    public int wuerfele() {
        int wert = random.nextInt(6);
        haeufigkeit[wert]++;
        return wert + 1;
    }

    /**
     * Gibt die Häufigkeit der Würfe zurück.
     *
     * @return die Statistik mit der Häufigkeit.
     */
    public static String statistik() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < haeufigkeit.length; i++) {
            result.append(i + 1).append(": ").append((haeufigkeit[i] / 10 / 2))
                    .append("% \n");
        }

        return result.toString();
    }
}
