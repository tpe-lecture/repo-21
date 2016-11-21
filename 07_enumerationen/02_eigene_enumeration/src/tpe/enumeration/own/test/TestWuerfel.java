package tpe.enumeration.own.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tpe.enumeration.own.Wuerfel;
import tpe.enumeration.own.WuerfelTyp;

/**
 * Test für die Würfel.
 */
public class TestWuerfel {

    /** Anzahl der Durchläufe (Gesetz der großen Zahl!). */
    private static final int RUNS = 10000000;

    /**
     * Testet die Fairness.
     */
    @Test
    public void testFairness() {
        WuerfelTyp[] wuerfel = WuerfelTyp.values();
        for (int i = 0; i < wuerfel.length; i++) {
            internalTestFairness(new Wuerfel(wuerfel[i]), wuerfel[i].average());
        }
    }

    /**
     * Interne Hilfsmethode, um die Fairness zu testen.
     *
     * @param wuerfel der zu testende Wuerfel.
     * @param expected Erwartungswert.
     */
    private void internalTestFairness(Wuerfel wuerfel, double expected) {

        long sum = 0;

        for (int i = 0; i < RUNS; i++) {
            sum += wuerfel.roll();
        }

        double average = (double) sum / (double) RUNS;

        assertEquals(expected, average, 0.1);
    }
}
