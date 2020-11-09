package ru.mirea.naz.pr17;


import java.util.Random;

public class MonsterThread extends Thread {
    Panel panel;
    Monster m1;
    MonsterThread(Panel panel, Monster m1){
        this.panel=panel;
        this.m1=m1;
    }
    public boolean MoveTrue(int x1,int x2, boolean n){
        if(n==true){
            x2-=m1.see;
            if(x1>x2){
                return true;
            }
        }
        else{
            x2+=m1.see;
            if(x1<x2){
                return true;
            }
        }
        if(m1.see<200)m1.see+=2;
        return false;
    }
    public void moveHome(){
        if (m1.xStart < m1.x) {
            m1.x -= m1.speed;
        } else if (m1.xStart > m1.x) {
            m1.x += m1.speed;
        } else if (m1.yStart < m1.y) {
            m1.y -= m1.speed;
        } else if (m1.yStart > m1.y) {
             m1.y += m1.speed;
        }
        panel.repaint();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        int s=m1.height;
        m1.height=0;
        while (m1.height<=s){
            m1.height+=5;
            panel.repaint();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        super.run();
        while(true){
            if(panel.hero.x<=m1.x+panel.hero.damageRad/2 && panel.hero.x>=m1.x-panel.hero.damageRad/2){
                if(panel.hero.y<=m1.y+10 && panel.hero.y>=m1.y-10){
                    if(panel.hero.bite==true){
                        m1.health-=panel.hero.damage;
                        if(m1.health<=0){
                            m1.life=false;
                            m1.icon=m1.death;
                            try {
                                Thread.sleep(5000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            Random random=new Random();
                            if(random.nextInt(100)<50){
                                m1.life=true;
                                m1.health=100;
                                m1.icon=m1.runR;
                                try {
                                    Thread.sleep(800);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            else{
                                break;
                            }
                        }
                        System.out.println("-----------------");
                    }
                }
            }
            if(panel.hero.life==true){
                if(m1.x<=panel.hero.x+m1.damageRad/2 && m1.x>=panel.hero.x-m1.damageRad/2){
                    if(m1.y<=panel.hero.y+10 && m1.y>=panel.hero.y-10){
                        panel.hero.health-=m1.damage;
                        if(panel.hero.health<=0)panel.hero.life=false;
                        System.out.println("----You death------");
                    }
                }
            }
            if (panel.hero.x < m1.x) {
                if(MoveTrue(panel.hero.x,m1.x,true)){
                    m1.icon= m1.runR;
                    m1.x -= m1.speed;}
                else{
                    m1.icon= m1.runR;
                    moveHome();
                }
            } else if (panel.hero.x > m1.x) {
                if(MoveTrue(panel.hero.x,m1.x,false)){
                    m1.icon= m1.runL;
                    m1.x += m1.speed;}
                else{


                    moveHome();
                }

            } else if (panel.hero.y < m1.y) {
                if(MoveTrue(panel.hero.y,m1.y,true)){
                    m1.icon= m1.runR;
                    m1.y -= m1.speed;}
                else{
                    m1.icon= m1.runR;
                    moveHome();
                }
            } else if (panel.hero.y > m1.y) {
                if(MoveTrue(panel.hero.y,m1.y,false)) {
                    m1.icon= m1.runL;
                    m1.y += m1.speed;}
                else{
                    m1.icon= m1.runL;
                    moveHome();
                }
            }
            panel.repaint();
            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        s=0;
        while (m1.height>s){
            m1.height-=5;
            panel.repaint();
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
