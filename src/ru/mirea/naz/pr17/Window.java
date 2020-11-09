package ru.mirea.naz.pr17;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    Panel panel=new Panel();
    ControlsListener listener=new ControlsListener();
    MainThread thread=new MainThread(panel,listener,this);
    DislocationThread dislocation=new DislocationThread(panel);
    Window(){
        Container container=this.getContentPane();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setBounds(0,0,1000,800);
        this.setVisible(true);
        panel.setBounds(0,0,this.getWidth(),this.getHeight());
        container.add(panel);
        this.addKeyListener(listener);
        //this.setExtendedState(MAXIMIZED_BOTH);
        thread.start();
        dislocation.start();
    }

}
