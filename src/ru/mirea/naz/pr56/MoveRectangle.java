package ru.mirea.naz.pr56;

public class MoveRectangle extends Rectangle implements Movable {

    private MovablePoint center;

    public MoveRectangle(String color, int height, int width, double x, double y) {
        super(color, height, width);
        center=new MovablePoint(x,y);
    }

    @Override
    public void move(double x, double y) {
        center.move(x,y);
    }

    @Override
    public String toString() {
        return "MoveRectangle{color=" + super.getColor()+
                ", center(" + center +
                ")}";
    }
}
