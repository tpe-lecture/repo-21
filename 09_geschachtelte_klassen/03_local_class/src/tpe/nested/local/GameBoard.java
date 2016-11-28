package tpe.nested.local;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import de.smits_net.games.framework.board.Board;

/**
 * Spielfeld.
 */
public class GameBoard extends Board {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /** Alien, das durch das Bild läuft. */
    private Alien alien;

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(800, 300), Color.BLACK);
        // Alien initialisieren
        alien = new Alien(this, new Point(800, 50 + new Random().nextInt(100)));
        /**
         * lokale Klasse die die Maus Klicks händelt.
         *
         * @author Luca
         *
         */
        class AlienExploder extends MouseAdapter {
            @Override
            public void mousePressed(MouseEvent e) {
                if (alien.intersects(new Point(e.getX(), e.getY()))) {
                    alien.explode();
                }
            }

        }
        AlienExploder alienEx = new AlienExploder();
        addMouseListener(alienEx);

    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     */
    @Override
    public void drawGame(Graphics g) {
        // Alien zeichnen
        alien.draw(g, this);
    }

    /**
     * Game-Over-Text anzeigen. Wird vom Framework aufgerufen.
     */
    @Override
    public void drawGameOver(Graphics g) {
        centerText(g, "Das Spiel ist aus!");
    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     */
    @Override
    public boolean updateGame() {
        alien.move();
        return alien.isVisible();
    }
}
