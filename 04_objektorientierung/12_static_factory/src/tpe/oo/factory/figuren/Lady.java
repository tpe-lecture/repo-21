package tpe.oo.factory.figuren;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.AnimatedImage;

/**
 * Lady.
 */
class Lady extends Figur {

    /**
     * Neuer Figur anlegen.
     *
     * @param board das Spielfeld
     */
    Lady(Board board) {
        super(board, new AnimatedImage(50, 8, "assets/lady.png"));
    }
}
