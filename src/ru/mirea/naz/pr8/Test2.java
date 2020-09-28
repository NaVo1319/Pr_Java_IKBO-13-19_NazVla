package ru.mirea.naz.pr8;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Test2 extends JPanel {
    private Image img;
    public Test2(Image img){
        this.img=img;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawImage(img,50,50,null);
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        Image img = null;
        System.out.println(args[0]);
        try {
            img = ImageIO.read(new File(args[0]));
        } catch (IOException e) {
            e.printStackTrace();
        }
        frame.setBounds(400,200,480,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container=frame.getContentPane();
        container.add(new Test2(img));
        frame.setVisible(true);

    }
}
