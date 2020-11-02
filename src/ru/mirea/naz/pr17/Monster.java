package ru.mirea.naz.pr17;

import javax.swing.*;
import java.awt.*;

public class Monster {
    int health;
    int speed;
    int damage=10;
    int damageRad=50;
    int x,y;
    int xStart,yStart;
    int width=40,height=60;
    int  see=100;
    boolean life=true;
    MonsterThread thread;
    Image icon=new ImageIcon(".\\src\\ru\\mirea\\naz\\pr17\\Resurses\\GostR.gif").getImage();
    Image stat=new ImageIcon(".\\src\\ru\\mirea\\naz\\pr17\\Resurses\\GostR.gif").getImage();
    Image runR=new ImageIcon(".\\src\\ru\\mirea\\naz\\pr17\\Resurses\\GostL.gif").getImage();
    Image runL=new ImageIcon(".\\src\\ru\\mirea\\naz\\pr17\\Resurses\\GostR.gif").getImage();
    public Monster(int health, int speed, int x, int y, Panel panel,int xStart,int yStart) {
        this.health = health;
        this.speed = speed;
        this.x = x;
        this.y = y;
        this.yStart=y;
        this.xStart=x;
        thread=new MonsterThread(panel,this);
        thread.start();
    }
    public int getBorderXLeft(){
        return x-width/2;
    }
    public int getBorderXRight(){
        return x+width/2;
    }
    public int getBorderYTop(){
        return y-height/2;
    }
    public int getBorderYBot(){
        return y+height/2;
    }
}
