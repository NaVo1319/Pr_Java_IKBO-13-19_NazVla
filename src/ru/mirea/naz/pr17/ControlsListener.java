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
        if (e.getKeyCode()==KeyEvent.VK_LEFT) isLeft = true;
        if (e.getKeyCode()==KeyEvent.VK_RIGHT) isRight = true;
        if (e.getKeyCode()==KeyEvent.VK_UP) isUp = true;
        if (e.getKeyCode()==KeyEvent.VK_DOWN) isDown = true;
        if(e.getKeyCode()==70) f=true;
        if(e.getKeyCode()!=70)log=e.getKeyCode();
        System.out.println(log);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_LEFT) isLeft = false;
        if (e.getKeyCode()==KeyEvent.VK_RIGHT) isRight = false;
        if (e.getKeyCode()==KeyEvent.VK_UP) isUp = false;
        if (e.getKeyCode()==KeyEvent.VK_DOWN) isDown = false;
        if(e.getKeyCode()==70) f=false;
    }
}
