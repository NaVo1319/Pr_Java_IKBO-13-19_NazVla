package ru.mirea.naz.pr8;

import java.awt.*;

public abstract class Shape {
    private Color color;
    private int x;
    private int y;

    public Shape(Color color, int x, int y) {

        this.color = color;
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public  abstract void setHeight(int height);

    public abstract int getWidth();

    public abstract int getHeight();
    public abstract void setWidth(int width);

    public abstract int getRadius();

    public abstract void setRadius(int radius);


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public int getTip(){return 0;}

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
