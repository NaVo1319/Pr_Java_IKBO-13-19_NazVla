package ru.mirea.naz.pr17;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    Room room=new Room(new ImageIcon(".\\src\\ru\\mirea\\naz\\pr17\\Resurses\\f.gif").getImage(),500,500,1000,1000);
    Room room2=new Room(new ImageIcon(".\\src\\ru\\mirea\\naz\\pr17\\Resurses\\f2.gif").getImage(),500,1450,1000,600);
    Room spawn=new Room(new ImageIcon(".\\src\\ru\\mirea\\naz\\pr17\\Resurses\\f.gif").getImage(),180,180,1,1);
    Hero hero=new Hero(100,10,180,100);
    Monster m1=new Monster(100,10,300,100,this,room.x,room.y);
    Monster m2=new Monster(100,10,600,100,this,room.x,room.y);
    int dislocation=0;
    Panel(){
        allY(-1700);
        allX(-200);
    }
    public void allX(int x){
        room.x+=x;
        room2.x+=x;
        spawn.x+=x;
        m1.x+=x;
        m2.x+=x;
        m1.xStart+=x;
        m2.xStart+=x;
    }
    public void allY(int y){
        room.y+=y;
        room2.y+=y;
        spawn.y+=y;
        m1.y+=y;
        m2.y+=y;
        m1.yStart+=y;
        m2.yStart+=y;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(room.icon, room.x-room.width/2,room.y-room.height/2-100, room.width, room.height+100,this);
        g.drawImage(room2.icon, room2.x-room2.width/2,room2.y-room2.height/2, room2.width, room2.height,this);
        g.setColor(Color.gray);
        g.drawImage(hero.icon, hero.x- hero.width/2,hero.y-hero.height/2,hero.width+80,hero.height+80,this);
        //Мобы
        g.setColor(Color.white);
        g.fillRect(m1.x,m1.y-m1.height,m1.health,10);
        g.setColor(Color.white);
        g.fillRect(m2.x,m2.y-m2.height,m2.health,10);
        g.drawImage(m1.icon, m1.x- m1.width/2,m1.y-m1.height/2,m1.width+80,m1.height+80,this);
        g.drawImage(m1.icon,m2.x- m2.width/2,m2.y-m2.height/2,m2.width+80,m2.height+80,this);
        //Интерфейс
        g.setColor(Color.black);
        g.fillRect(0,getHeight()-100,getWidth(),100);
        g.setColor(Color.white);
        g.fillRect(60,getHeight()-80,60,60);
        g.setColor(Color.white);
        g.fillRect(160,getHeight()-80,hero.health,10);

    }

}
