package ru.mirea.naz.pr8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Test3 extends JPanel {
    private Image[] img;
    private int i=0;
    public Test3(Image[] img){
        this.img=img;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        i++;
        if(i==40){i=1;}
        g.drawImage(img[i], 0, 0, null);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame=new JFrame();
        Image[] img = new Image[40];
        String fileName;
        for(int i=0; i<40;++i) {
            fileName="chaos-00";
            if(i<10){fileName+="0";}
            fileName+=i;
            try {
                img[i] = ImageIO.read(new File("./src/ru/mirea/naz/pr8/resurses/"+fileName+".jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        frame.setBounds(400,200,450,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container=frame.getContentPane();
        container.add(new Test3(img));
        frame.setVisible(true);
        while(true){
            for(int i=0;i<40;++i){
                frame.repaint();
                Thread.sleep(30);

            }

        }

    }
}
