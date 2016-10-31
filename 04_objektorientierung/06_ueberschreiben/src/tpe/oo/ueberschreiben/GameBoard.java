package tpe.oo.ueberschreiben;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.util.Random;
import de.smits_net.games.framework.sprite.Direction;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.ImageBase;

/**
 * Spielfeld.
 */
@SuppressWarnings("serial")
public class GameBoard extends Board {

    /** Alien, das durch das Bild läuft. */
    private Alien[] aliens = new Alien[8];
    private Image background;

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(400, 400), Color.BLACK);
        // background laden
        background = ImageBase.loadImage("assets/background");

        // Alien initialisieren
        for (Alien alien : aliens) {
            alien = new Alien(this,
                    new Point(new Random().nextInt(400),
                            50 + new Random().nextInt(100)),
                    Direction.WEST, new Random().nextInt(5));
        }

        // Alien soll auf Maus-Klicks reagieren
        for (Alien alien : aliens) {
            addMouseListener(alien);
        }

    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     */
    /**
     * @param g fdg
     */
    protected void drawBackground(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }

    @Override
    public void drawGame(Graphics g) {
        // Alien zeichnen
        for (Alien alien : aliens) {
            alien.draw(g);
        }
    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     */
    @Override
    public boolean updateGame() {
        for (Alien alien : aliens) {
            alien.move();
        }
        return isVisible();
    }

    public boolean isVisible() {
        for (Alien alien : aliens) {
            if (alien.isVisible()) {
                return true;
            }
            else if(!alien.isVisible()){
                return false;
            }
        }

    }
}
