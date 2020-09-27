package ru.mirea.naz.pr56;

public class MovableCircle extends Circle implements Movable {
     private MovablePoint center;

    public MovableCircle(String color, int radius,double x, double y) {
        super(color, radius);
        center=new MovablePoint(x,y);
    }

    @Override
    public void move(double x, double y) {
        center.move(x,y);
    }

    @Override
    public String toString() {
        return "MovableCircle{color=" + super.getColor()+
        ", center(" + center +
                "), radius=" + super.getRadius() +
                '}';
    }
}
