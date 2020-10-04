package ru.mirea.naz.pr910;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class EventButton extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        Shape[]shapes=new Shape[20];
        Random rand=new Random();
        Color randomColor;
        int randTip;
        for(int i=0;i<20;++i){
            randTip=rand.nextInt(3)+1;
            switch (randTip){
                case 1:
                    randomColor = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
                    shapes[i]=new Rectangle(randomColor,100,50,rand.nextInt(500),rand.nextInt(500));
                    break;
                case 2:
                    randomColor = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
                    shapes[i]=new Circle(randomColor,60,rand.nextInt(500),rand.nextInt(500));
                    break;
                case 3:
                    randomColor = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
                    shapes[i]=new Triangle(randomColor,rand.nextInt(500),rand.nextInt(500));
                    break;
            }
        }
        super.paintComponent(g);
        Graphics2D g2= (Graphics2D) g;
        for(Shape i: shapes) {
            switch (i.getTip()){
                case 1:
                    g2.setColor(i.getColor());
                    g2.fillRect(i.getX(), i.getY(), i.getHeight(), i.getWidth());
                    break;
                case 2:
                    g2.setColor(i.getColor());
                    g2.fillOval(i.getX(), i.getY(),i.getRadius(),i.getRadius());
                    break;
                case 3:
                    g2.setColor(i.getColor());
                    int[] xm={i.getX(),i.getX()+20,i.getX()-20};
                    int[] ym={i.getY()+20,i.getY()-20,i.getY()-20};
                    g2.fillPolygon(xm,ym,3);
                    break;
            }
        }
    }
}
