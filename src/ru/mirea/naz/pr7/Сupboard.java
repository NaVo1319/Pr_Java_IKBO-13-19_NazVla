package ru.mirea.naz.pr7;

import java.util.Arrays;

public class Сupboard  extends Furniture{
    private int doorNum;
    private int[] doorStat;

    public Сupboard(String name ,String data, double price, String material, int doorNum) {
        super(name ,data, price, material);
        this.doorNum = doorNum;
        doorStat=new int[doorNum];
    }

    public int getDoorNum() {
        return doorNum;
    }

    public void setDoorNum(int doorNum) {
        this.doorNum = doorNum;
    }

    public int[] getDoorStat() {
        return doorStat;
    }

    public void setDoorStat(int[] doorStat) {
        this.doorStat = doorStat;
    }

    public  void openDoor(int doorNum){
        doorStat[doorNum]=1;
    }
    public  void closeDoor(int doorNum){
        doorStat[doorNum]=0;
    }
}
