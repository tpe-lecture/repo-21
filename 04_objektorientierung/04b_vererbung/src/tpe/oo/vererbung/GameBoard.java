package tpe.oo.vererbung;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.ImageBase;
import de.smits_net.games.framework.sprite.Sprite;

/**
 * Spielfeld.
 */
@SuppressWarnings("serial")
public class GameBoard extends Board {

    /** Alien, das durch das Bild läuft. */
    private AlienSprite alien;
    private AlienSprite secondAlien;
    private AlienSprite thirdAlien;

    /** Asteroid. */
    private Sprite asteroid;

    /** Hintergrundbild. */
    private Image background;

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(800, 600), Color.BLACK);

        // // Hintergrundbild laden
        background = ImageBase.loadImage("assets/background");
        alien = new AlienSprite(this, new Point(800, 200));
        secondAlien = new AlienSprite(this, new Point(800, 100));
        thirdAlien = new AlienSprite(this, new Point(800, 300));
        asteroid = new Asteroid(this, new Point(0, 400));
    }

    /**
     * Hintergrund zeichnen.
     */
    protected void drawBackground(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     *
     * @param g Der Grafik-Kontext
     */
    public void drawGame(Graphics g) {
        alien.draw(g);
        secondAlien.draw(g);
        asteroid.draw(g);
        thirdAlien.draw(g);
    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     *
     * @return Spiel läuft weiter, solange diese methode <code>true</code>
     *         zurück gibt
     */
    public boolean updateGame() {
        alien.move();
        secondAlien.move();
        asteroid.move();
        thirdAlien.move();
        // Kollision erkennen
        if (alien.intersects(asteroid) && alien.isActive()) {
            alien.explode();
        }else if(secondAlien.intersects(asteroid)&& secondAlien.isActive()){
            secondAlien.explode();
        }else if(thirdAlien.intersects(asteroid)&&thirdAlien.isActive()){
            thirdAlien.explode();
        }

        return true;
    }
}
