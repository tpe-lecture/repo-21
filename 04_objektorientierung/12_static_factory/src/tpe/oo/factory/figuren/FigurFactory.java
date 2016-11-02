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
        if (i < 1) {
            figur = new Wizard(b);
        }
        else if (i < 2) {
            figur = new Ninja(b);
        }
        else if (i < 3) {
            figur = new Lady(b);
        }
        else {
            figur = new Knight(b);
        }
        return figur;
    }

}
