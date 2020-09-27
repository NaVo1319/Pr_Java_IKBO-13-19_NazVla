package ru.mirea.naz.pr56;

public class Square extends Rectangle {
    private int height;

    public Square(String color, int height) {
        super(color, height, height);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "Square{color=" + super.getColor()+
                ", height=" + height +
                '}';
    }
}
