package ru.mirea.naz.pr8;

import java.awt.*;

public class Triangle extends Shape {
    public Triangle(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public int getTip() {
        return 3;
    }
    public  void setHeight(int height){};

    public  int getWidth(){return 0;};

    public int getHeight(){return 0;};
    public  void setWidth(int width){};
    public int getRadius(){return 0;};

    public void setRadius(int radius){};
}
