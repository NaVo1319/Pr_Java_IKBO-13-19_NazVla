package ru.mirea.naz.pr30;

public abstract class AbstractQueue {
    int top;
    int bottom;
    int size;
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(size==0)return true;
        return false;
    }
}
