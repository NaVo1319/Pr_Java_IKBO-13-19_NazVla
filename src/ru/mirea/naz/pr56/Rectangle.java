package ru.mirea.naz.pr56;

public class Rectangle extends Shape {
    private int height;
    private int width;
    public Rectangle(String color, int height,int width) {
        super(color);
        this.height=height;
        this.width=width;
    }

    @Override
    public String toString() {
        return "Rectangle{color=" + super.getColor()+
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
