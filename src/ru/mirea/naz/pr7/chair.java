package ru.mirea.naz.pr7;

public class chair extends Furniture {
    private int chairLegNum;
    private int chairStat;

    public chair(String name ,String data, double price, String material, int chairLegNum) {
        super(name,data, price, material);
        this.chairLegNum = chairLegNum;
        this.chairStat=0;
    }

    public int getChairLegNum() {
        return chairLegNum;
    }

    public void setChairLegNum(int chairLegNum) {
        this.chairLegNum = chairLegNum;
    }
    public void sitDownChair(){
        chairStat=1;
    }
    public void sitUpChair(){
        chairStat=0;
    }
}
