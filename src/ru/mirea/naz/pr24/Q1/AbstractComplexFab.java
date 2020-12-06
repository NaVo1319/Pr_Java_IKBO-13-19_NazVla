package ru.mirea.naz.pr24.Q1;

public class AbstractComplexFab {
     private double x;
     private double y;
     public AbstractComplexFab(double x, double y){
         this.x=x;
         this.y=y;
     }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "z="+x+"+"+y+"*i";
    }
}
