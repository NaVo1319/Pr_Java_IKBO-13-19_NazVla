package ru.mirea.naz.pr17;

import javax.swing.*;

public class MainThread extends Thread {
    Panel panel;
    ControlsListener listener;
    Window window;
    boolean[] moveTrue={true,true,true,true};
    MainThread(Panel panel, ControlsListener listener, Window window){
        this.panel=panel;
        this.listener=listener;
        this.window=window;
    }
    public boolean room(){
        if(panel.room.getBorderXLeft()<=panel.hero.getBorderXLeft() && panel.room.getBorderXRight()>=panel.hero.getBorderXRight()){
            if(panel.room.getBorderYBot()>=panel.hero.getBorderYBot() && panel.room.getBorderYTop()<=panel.hero.getBorderYTop()){
                return true;
            }
        }
        return false;
    }
    @Override
    public void run() {
        super.run();
        while (true){
            if(listener.isRight || listener.isDown){panel.hero.icon=panel.hero.runR;}
            else if(listener.isLeft || listener.isUp) {panel.hero.icon=panel.hero.runL;}
            else {panel.hero.icon=panel.hero.stat;}
            if(panel.dislocation==0)panel.room.MoveTrue(moveTrue, panel.hero.x,panel.hero.y);
            if(panel.dislocation==1)panel.room2.MoveTrue(moveTrue, panel.hero.x,panel.hero.y);
            if(panel.dislocation==3)moveTrue=new boolean[]{true,true,true,true};
            if(panel.hero.life==false){
                JOptionPane.showMessageDialog(panel,"Game Over");
                System.exit(0);
            }
            if(listener.f==true){
                panel.hero.bite=true;
                panel.hero.icon=panel.hero.Dam;
                panel.repaint();
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                panel.hero.bite=false;
                panel.hero.icon=panel.hero.stat;
            }
                if(listener.isRight==true){
                    if( moveTrue[0]){
                        panel.allX(panel.hero.speed*(-1));
                        panel.repaint();
                        System.out.println("---Вправо");
                    }
                }
                else if(listener.isLeft==true){
                    if(moveTrue[2]){
                        panel.allX(panel.hero.speed);
                        panel.repaint();
                        System.out.println("---Влево");
                    }
                }
                else if(listener.isDown==true){
                    if(moveTrue[1]){
                        panel.allY(panel.hero.speed*(-1));
                        panel.repaint();
                        System.out.println("---Вниз");
                    }
                }
                else if(listener.isUp==true){
                    if(moveTrue[3]){
                        panel.allY(panel.hero.speed);
                        panel.repaint();
                        System.out.println("---Вверх");
                    }
                }

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
