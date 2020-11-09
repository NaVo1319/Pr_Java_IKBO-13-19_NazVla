package ru.mirea.naz.pr17;

import javax.swing.*;

public class DislocationThread extends Thread {
    Panel panel;
    int time=0;
    public DislocationThread(Panel panel) {
        this.panel = panel;
    }

    @Override
    public void run() {
        while(true){

            if(panel.hero.x<panel.room.getBorderXRight() && panel.hero.x>panel.room.getBorderXLeft()){
                if(panel.hero.y<panel.room.getBorderYBot() && panel.hero.x>panel.room.getBorderYTop()){
                    panel.dislocation=0;
                    if(panel.hero.x<panel.room2.getBorderXRight() && panel.hero.x>panel.room2.getBorderXLeft()){
                        if(panel.hero.y<panel.room2.getBorderYBot() && panel.hero.x>panel.room2.getBorderYTop()){
                            panel.dislocation=99;
                        }
                    }
                }
            }
            if(panel.hero.x<panel.room2.getBorderXRight() && panel.hero.x>panel.room2.getBorderXLeft()){
                if(panel.hero.y<panel.room2.getBorderYBot() && panel.hero.x>panel.room2.getBorderYTop()){
                    panel.dislocation=1;
                    if(panel.hero.x<panel.room.getBorderXRight() && panel.hero.x>panel.room.getBorderXLeft()){
                        if(panel.hero.y<panel.room.getBorderYBot() && panel.hero.x>panel.room.getBorderYTop()){
                            panel.dislocation=99;
                        }
                    }
                }
            }
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            time++;
            if(time==100 && panel.hero.health!=150){
                panel.hero.health+=5;
                System.out.println("Health+++++");
                time=0;
            }
            if(!panel.m1.life &&!panel.m2.life &&!panel.m3.life &&!panel.m4.life && panel.hero.life){
                try {
                    Thread.sleep(2100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(panel,"You Win!");
                System.exit(0);
            }
        }
    }

}
