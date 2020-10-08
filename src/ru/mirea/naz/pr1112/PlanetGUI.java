package ru.mirea.naz.pr1112;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlanetGUI extends JFrame implements ActionListener {
    private JButton me=new JButton("Меркурий");
    private JButton v=new JButton("Венера");
    private JButton e=new JButton("Земля");
    private JButton ma=new JButton("Марс");
    private JButton j=new JButton("Юритер");
    private JButton s=new JButton("Сатурн");
    private JButton u=new JButton("Уран");
    private JButton n=new JButton("Нептун");
    private JLabel result=new JLabel("G=");
     public PlanetGUI(){
         this.setBounds(400,200,660,450);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setResizable(false);
         setLayout(null);
         Container container=this.getContentPane();
         container.add(result);
         result.setBounds(180,120,4000,100);
         result.setFont(new Font("Serif", Font.PLAIN, 40));
         container.add(me);
         me.setBounds(10,10,100,40);
         me.addActionListener(this);

         container.add(v);
         v.setBounds(10,60,100,40);
         v.addActionListener(this);

         container.add(e);
         e.setBounds(10,110,100,40);
         e.addActionListener(this);

         container.add(ma);
         ma.addActionListener(this);
         ma.setBounds(10,160,100,40);

         container.add(j);
         j.addActionListener(this);
         j.setBounds(10,210,100,40);

         container.add(s);
         s.addActionListener(this);
         s.setBounds(10,260,100,40);

         container.add(u);
         u.addActionListener(this);
         u.setBounds(10,310,100,40);

         container.add(n);
         n.addActionListener(this);
         n.setBounds(10,360,100,40);

         setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button= (JButton) e.getSource();
        String name= button.getText();
        if(name.equals("Меркурий")){result.setText("G="+Planet.MERCURY.Gravitation());}
        if(name.equals("Венера")){result.setText("G="+Planet.VENUS.Gravitation());}
        if(name.equals("Земля")){result.setText("G="+Planet.EARTH.Gravitation());}
        if(name.equals("Марс")){result.setText("G="+Planet.MARS.Gravitation());}
        if(name.equals("Юритер")){result.setText("G="+Planet.JUPITER.Gravitation());}
        if(name.equals("Сатурн")){result.setText("G="+Planet.SATURN.Gravitation());}
        if(name.equals("Уран")){result.setText("G="+Planet.URANUS.Gravitation());}
        if(name.equals("Нептун")){result.setText("G="+Planet.NEPTUNE.Gravitation());}
    }
}
