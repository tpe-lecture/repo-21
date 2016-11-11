package tpe.oo.factory.figuren;

import java.util.Random;

import de.smits_net.games.framework.board.Board;

/**
 * Pattorn Factory für die verschiedenen Figuren.
 *
 * @author Luca
 *
 */
public class FigurFactory {
    /**
     * Erstellen eines neuen Objektes vom Typ Random.
     */
    private Random rand = new Random();

    /**
     * Die eigentliche Methode welche die Figuren per zufall erzeugt.
     *
     * @param b das Board das zum Spielen benutzt wird
     * @return Figur gibt eine der möglichen Figuren zurück.
     */
    public Figur createFigur(Board b) {
        Figur figur;
        int i = rand.nextInt(4);
        switch (i) {
            case 1:
                return new Wizard(b);
            case 2:
                return new Ninja(b);
            case 3:
                return new Lady(b);
            default:
                return new Knight(b);
        }
    }

}
