package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;

public class DualShock4 implements DigitalController, AnalogController {
    @SuppressWarnings("unused")
    private Point position = new Point(0, 0);
    @SuppressWarnings("unused")
    private Point position2 = new Point(0, 0);

    private DigitalController dc = new DigitalControllerImpl();
    private AnalogController ac = new AnalogControllerImpl();

    @Override
    public void up(double percentage) {
        ac.up(percentage);
    }

    @Override
    public void down(double percentage) {
        ac.down(percentage);
    }

    @Override
    public void left(double percentage) {
        ac.left(percentage);
    }

    @Override
    public void right(double percentage) {
        ac.right(percentage);
    }

    @Override
    public void up() {
        dc.up();
    }

    @Override
    public void down() {
        dc.down();

    }

    @Override
    public void left() {
        dc.left();

    }

    @Override
    public void right() {
        dc.right();

    }

    @Override
    public Point getPosition() {
        Point pointDC = dc.getPosition();
        Point pointAC = ac.getPosition();
        Point result = new Point();
        result.x = pointDC.x + pointAC.x;
        result.y = pointDC.y + pointAC.y;
        return result;

    }

}
