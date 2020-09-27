package ru.mirea.naz.pr8;

import javax.swing.*;
import java.awt.*;

public class EventButton extends JPanel{
     private Shape[] shapes;
    public EventButton(Shape[] shapes){
        this.shapes=shapes;
    }
    @Override
    protected void paintComponent(Graphics g) {
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
