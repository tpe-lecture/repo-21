package tpe.nested.lambda;

import java.util.Arrays;

/**
 * Hauptklasse.
 */
public class Main {

    private static final int[] ZAHLEN = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
            13, 14, 15, 16, 17, 18, 19, 20 };

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeileargumente.
     */
    public static void main(String[] args) {

        NumberSelector s = new NumberSelector();

        int[] gerade = s.filter((zahl) -> zahl % 2 == 0, ZAHLEN);

        System.out.println(Arrays.toString(gerade));

        int[] ungerade = s.filter((zahl) -> zahl % 2 == 1, ZAHLEN);

        System.out.println(Arrays.toString(ungerade));

        int[] modVier = s.filter((zahl) -> zahl % 4 == 0, ZAHLEN);
        System.out.println(Arrays.toString(modVier));
    }
}
