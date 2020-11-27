package ru.mirea.naz.pr17;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControlsListener implements KeyListener {
    boolean isLeft = false;
    boolean isRight = false;
    boolean isUp = false;
    boolean isDown = false;
    boolean f=false;
    int log=0;
    public void Update(){
        isLeft = false;
        isRight = false;
        isUp = false;
        isDown = false;
        f=false;
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==65) isLeft = true;
        if (e.getKeyCode()==68) isRight = true;
        if (e.getKeyCode()==87) isUp = true;
        if (e.getKeyCode()==83) isDown = true;
        if(e.getKeyCode()==70) f=true;
        if(e.getKeyCode()!=70)log=e.getKeyCode();
        if(log!=0)System.out.println(log);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode()==65) isLeft = false;
        if (e.getKeyCode()==68) isRight = false;
        if (e.getKeyCode()==87) isUp = false;
        if (e.getKeyCode()==83) isDown = false;
        if(e.getKeyCode()==70) f=false;
    }
}
