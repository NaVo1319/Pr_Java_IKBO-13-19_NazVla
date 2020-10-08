package ru.mirea.naz.pr1112;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Window extends JFrame implements ActionListener {
    private JTextField text=new JTextField(10);
    private JButton button= new JButton("Угадать");
    private JLabel label=new JLabel("------");
    private JLabel label1=new JLabel();
    private int life=3;
    private int random=new Random().nextInt(21);
    String[] str={"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
    public Window(){
        super("Угадайка");
        this.setBounds(400,200,300,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container=this.getContentPane();
        setLayout(new FlowLayout());
        button.addActionListener(this);
        label1.setText("Life: "+life);
        container.add(label1);
        container.add(text);
        container.add(button);
        container.add(label);
        setResizable(false);
        System.out.println(random);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s=text.getText();
        if(life>0){
            if(str[random].equals(s)){
                JOptionPane.showMessageDialog(null,"Вы Угадали!");
                System.exit(1);
            }
            else{
                String message="";
                for(int i=0;i<str.length;++i){
                    if(str[i].equals(s)){
                        if(i>random){message=s+">"+"x";}
                        else{message=s+"<"+"x";}
                        break;
                    }
                    else {message="Число не принадлежит -> [0;20]";}
                }
                life--;
                label1.setText("Life: "+life);
                if(s.length()<=5){label.setText(s);}
                else {label.setText("------");}
                text.setText("");
                JOptionPane.showMessageDialog(null,"Вы ошиблись... ("+message+")");
            }
        }
        else{
            s=label1.getText();
            if(!s.contains("Life: 0 (Game Over)")){
                label1.setText("Life: 0 (Game Over)");
                label.setText("------");
            }
            text.setText("");
            System.exit(1);
            JOptionPane.showMessageDialog(null,"У вас закончились жизни");
        }

    }
}
