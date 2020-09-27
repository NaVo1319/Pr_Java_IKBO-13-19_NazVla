package ru.mirea.naz.pr8;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private JLabel label = new JLabel("Это Окно");
    public Window(Shape[] shapes){
        super("Окно");
        this.setBounds(400,200,1500,1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container=this.getContentPane();
        container.add(label);
        container.add(new EventButton(shapes));
        setVisible(true);
    }
}
