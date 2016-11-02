package tpe.oo.factory.figuren;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.AnimatedImage;

/**
 * Alien.
 */
public class Knight extends Figur {
    /**
     * Neuer Figur anlegen.
     *
     * @param board das Spielfeld
     */
    Knight(Board board) {
        super(board, new AnimatedImage(50, 8, "assets/knight.png"));
    }
}
