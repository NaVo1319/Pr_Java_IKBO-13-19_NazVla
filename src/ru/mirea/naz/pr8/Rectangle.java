package ru.mirea.naz.pr8;

import java.awt.*;

public class Rectangle extends Shape {
    private int height;
    private int width;
    public Rectangle(Color color, int height, int width, int x, int y) {
        super(color,x,y);
        this.height=height;
        this.width=width;
    }

    @Override
    public void setHeight(int height) {
        this.height=height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setWidth(int width) {
        this.height=height;
    }

    @Override
    public int getTip() {
        return 1;
    }

    @Override
    public String toString() {
        return "super.toString()";
    }
    public int getRadius(){return 0;};

    public void setRadius(int radius){};
}
