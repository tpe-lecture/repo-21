package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;

public class AnalogControllerImpl implements AnalogController {
    private Point position = new Point(0, 0);
    public double x = 0, y = 0;

    @Override
    public void up(double percentage) {
        y += percentage * -1;
    }

    @Override
    public void down(double percentage) {
        y += percentage;
    }

    @Override
    public void left(double percentage) {
        x += percentage * -1;
    }

    @Override
    public void right(double percentage) {
        x += percentage;
    }

    @Override
    public Point getPosition() {
        position.setLocation((int) x, (int) y);
        return (Point) position.clone();
    }

}
