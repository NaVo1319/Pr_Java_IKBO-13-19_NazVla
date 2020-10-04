package ru.mirea.naz.pr910;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
    private JButton button=new JButton("Запуск");
    public Window(){
        super("Окно");
        this.setBounds(400,200,1500,1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(this);
        button.setSize(100,50);
        button.setLocation(600,50);
        Container container=this.getContentPane();
        container.add(button);
        container.add(new EventButton());
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
