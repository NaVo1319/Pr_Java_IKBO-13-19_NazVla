package ru.mirea.naz.pr17;

import javax.swing.*;
import java.awt.*;

public class Hero {
    int health;
    int speed;
    int damage=20;
    int x,y;
    int damageRad=100;
    int width=40,height=60;
    boolean bite=false;
    boolean life;
    Image icon=new ImageIcon(".\\src\\ru\\mirea\\naz\\pr17\\Resurses\\hero.gif").getImage();
    Image stat=new ImageIcon(".\\src\\ru\\mirea\\naz\\pr17\\Resurses\\hero.gif").getImage();
    Image runR=new ImageIcon(".\\src\\ru\\mirea\\naz\\pr17\\Resurses\\heroR.gif").getImage();
    Image runL=new ImageIcon(".\\src\\ru\\mirea\\naz\\pr17\\Resurses\\heroL.gif").getImage();
    Image Dam=new ImageIcon(".\\src\\ru\\mirea\\naz\\pr17\\Resurses\\heroBite.gif").getImage();
    public Hero(int health, int speed, int x, int y) {
        this.health = health;
        this.speed = speed;
        this.x = x;
        this.y = y;
        this.life=true;
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
    public void respawn(int x, int y){
        this.x=x;
        this.y=y;
        life=true;
        health=100;
    }
}
