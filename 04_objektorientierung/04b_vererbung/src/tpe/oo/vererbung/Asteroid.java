package tpe.oo.vererbung;

import java.awt.Point;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.ImageBase;
import de.smits_net.games.framework.image.ImagePack;
import de.smits_net.games.framework.sprite.Direction;
import de.smits_net.games.framework.sprite.Sprite;

/**
 * Ein Asteroid.
 */
public class Asteroid extends Sprite {

    /**
     * Neues Objekt anlegen.
     *
     * @param board das Spielfeld
     * @param startPoint Start-Position
     */
    public Asteroid(Board board, Point startPoint) {
        super(board, startPoint, BoundaryPolicy.JUMP_BACK,
                new ImagePack(ImageBase.loadImage("assets/asteroid")));
        velocity.setVelocity(Direction.NORTHEAST, 3.0);
    }
}
