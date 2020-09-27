package ru.mirea.naz.pr56;

public class Circle extends Shape{
     private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{color=" + super.getColor()+
                ", radius=" + radius +
                '}';
    }
}
