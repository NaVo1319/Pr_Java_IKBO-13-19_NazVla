package ru.mirea.naz.pr7;

public class Bed extends Furniture {
    private String bedTip;
    private int bedStat;

    public Bed(String name ,String data, double price, String material, String bedTip) {
        super(name,data, price, material);
        this.bedTip = bedTip;
        bedStat=0;
    }

    public String getBedTip() {
        return bedTip;
    }

    public void setBedTip(String bedTip) {
        this.bedTip = bedTip;
    }
    public void sleep(){
        bedStat=1;
    }
    public void up(){
        bedStat=0;
    }
}
