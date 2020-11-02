package ru.mirea.naz.pr17;

public class DislocationThread extends Thread {
    Panel panel;

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
                Thread.sleep(80);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
