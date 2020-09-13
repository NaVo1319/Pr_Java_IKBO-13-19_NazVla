package ru.mirea.naz;

public class Circle {
    private double R;
    private double S;
    private double L;
    public Circle(double r){
        R=r;
        S=r*r*3.14;
        L=2*3.14*r;
    }

    public double getL() {
        return L;
    }

    public double getR() {
        return R;
    }

    public double getS() {
        return S;
    }

    public void setL(double l) {
        L = l;
    }

    public void setR(double r) {
        R = r;
    }

    public void setS(double s) {
        S = s;
    }
}
