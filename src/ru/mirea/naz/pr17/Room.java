package ru.mirea.naz.pr17;

import javax.swing.*;
import java.awt.*;

public class Room {
    int x,y;
    int height,width;
    Image icon;

    public Room(Image icon, int x, int y, int height, int width) {
        this.icon=icon;
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
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
    public boolean[]  MoveTrue(boolean[] move, int x, int y){
        boolean[] m=move;
        if(this.getBorderXRight()-20<=x){
            m[0]=false;
        }
        else {
            m[0]=true;
        }
        if(this.getBorderYBot()-20<=y){
            m[1]=false;
        }else {
            m[1]=true;
        }

        if(this.getBorderXLeft()+20>=x){
            m[2]=false;
        }else {
            m[2]=true;
        }
        if(this.getBorderYTop()+20>=y){
            m[3]=false;
        }else {
            m[3]=true;
        }
        return m;
    }
}
