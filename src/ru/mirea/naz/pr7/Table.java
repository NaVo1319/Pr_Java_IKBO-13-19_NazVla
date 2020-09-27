package ru.mirea.naz.pr7;

public class Table extends Furniture {
    private int heidth;
    private int width;

    public Table(String name ,String data, double price, String material, int heidth, int width) {
        super(name ,data, price, material);
        this.heidth = heidth;
        this.width = width;
    }

    public int getHeidth() {
        return heidth;
    }

    public void setHeidth(int heidth) {
        this.heidth = heidth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public String knockTable(){
        return "knock-knock...";
    }
}
