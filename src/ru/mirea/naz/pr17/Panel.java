package ru.mirea.naz.pr17;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    Image portret=new ImageIcon(".\\src\\ru\\mirea\\naz\\pr17\\Resurses\\Portret.jpg").getImage();
    Image runR=new ImageIcon(".\\src\\ru\\mirea\\naz\\pr17\\Resurses\\GostL.gif").getImage();
    Image runL=new ImageIcon(".\\src\\ru\\mirea\\naz\\pr17\\Resurses\\GostR.gif").getImage();
    Image death=new ImageIcon(".\\src\\ru\\mirea\\naz\\pr17\\Resurses\\GostDeath.gif").getImage();
    Room room=new Room(new ImageIcon(".\\src\\ru\\mirea\\naz\\pr17\\Resurses\\MainRoom.jpg").getImage(),500,500,1000,1000);
    Room room2=new Room(new ImageIcon(".\\src\\ru\\mirea\\naz\\pr17\\Resurses\\VKRoom.jpg").getImage(),506,1450,1000,325);
    Room spawn=new Room(new ImageIcon("").getImage(),180,180,1,1);
    Hero hero=new Hero(100,10,500,400);
    Monster m1=new Monster(100,10,250,100,this,room.x,room.y);
    Monster m2=new Monster(100,10,650,100,this,room.x,room.y);
    Monster m3=new Monster(100,10,100,600,this,room.x,room.y);
    Monster m4=new Monster(100,10,700,600,this,room.x,room.y);
    int dislocation=0;
    Panel(){
        allY(-1500);
        allX(-100);
    }
    public void allX(int x){
        room.x+=x;
        room2.x+=x;
        spawn.x+=x;
        m1.x+=x;
        m2.x+=x;
        m1.xStart+=x;
        m2.xStart+=x;
        m3.x+=x;
        m3.xStart+=x;
        m4.x+=x;
        m4.xStart+=x;
    }
    public void allY(int y){
        room.y+=y;
        room2.y+=y;
        spawn.y+=y;
        m1.y+=y;
        m2.y+=y;
        m1.yStart+=y;
        m2.yStart+=y;
        m3.y+=y;
        m3.yStart+=y;
        m4.y+=y;
        m4.yStart+=y;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(0,0,getWidth(),getHeight());
        //Комнаты
        g.drawImage(room2.icon, room2.x-room2.width/2,room2.y-room2.height/2, room2.width+40, room2.height+80,this);
        g.drawImage(room.icon, room.x-room.width/2,room.y-room.height/2-100, room.width+50, room.height+200,this);
        g.setColor(Color.gray);
        if(hero.life==true)g.drawImage(hero.icon, hero.x- hero.width/2,hero.y-hero.height/2,hero.width+80,hero.height+80,this);
        //Мобы
        //Здоровье
        g.setColor(Color.red);
        g.fillRect(m1.x,m1.y-m1.height,m1.health,10);
        g.setColor(Color.red);
        g.fillRect(m2.x,m2.y-m2.height,m2.health,10);
        g.setColor(Color.red);
        g.fillRect(m3.x,m3.y-m3.height,m3.health,10);
        g.setColor(Color.red);
        g.fillRect(m4.x,m4.y-m4.height,m4.health,10);
        //Сам моб
        g.drawImage(m1.icon, m1.x- m1.width/2,m1.y-m1.height/2,m1.width+80,m1.height+80,this);
        g.drawImage(m2.icon,m2.x- m2.width/2,m2.y-m2.height/2,m2.width+80,m2.height+80,this);
        g.drawImage(m3.icon,m3.x- m3.width/2,m3.y-m3.height/2,m3.width+80,m3.height+80,this);
        g.drawImage(m4.icon,m4.x- m4.width/2,m4.y-m4.height/2,m4.width+80,m4.height+80,this);
        //Интерфейс
        g.setColor(Color.black);
        g.fillRect(0,getHeight()-100,getWidth(),100);
        g.drawImage(portret,60,getHeight()-80,60,60,this);
        g.setColor(Color.red);
        g.fillRect(160,getHeight()-80,hero.health,10);

    }

}
