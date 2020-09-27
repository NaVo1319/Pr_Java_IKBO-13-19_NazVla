package ru.mirea.naz.pr8;

import java.awt.*;

public class Circle extends Shape{
     private int radius;

    public Circle(Color color, int radius, int x, int y) {
        super(color,x,y);
        this.radius = radius;
    }

    @Override
    public int getRadius() {
        return radius;
    }

    @Override
    public void setRadius(int radius) {
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "super.toString()";
    }

    @Override
    public int getTip() {
        return 2;
    }
    public  void setHeight(int height){};

    public  int getWidth(){return 0;};

    public int getHeight(){return 0;};
    public  void setWidth(int width){};
}
