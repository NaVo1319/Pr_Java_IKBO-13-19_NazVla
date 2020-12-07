package ru.mirea.naz.pr30;

import java.util.ArrayList;

public class LinkedQueue extends AbstractQueue implements Queue {
    private ArrayList<Integer> list;
    public LinkedQueue(){
        list=new ArrayList<>();
        super.top=0;
        super.size=0;
        super.bottom=0;
    }
    public void enqueue(int element){
        list.add(element);
        super.top++;
        super.size++;
    }
    public int element(){
        return list.get(super.bottom);
    }
    public int dequeue(){
        int element=list.get(super.bottom);
        list.remove(super.bottom);
        super.size--;
        return element;
    }
    public void clear(){
        super.top= 0;
        super.bottom=0;
        super.size=0;
        list.clear();
    }

    @Override
    public String toString() {
        return "LinkedQueue{" +
                "list=" + list +
                ", top=" + top +
                ", bottom=" + bottom +
                ", size=" + size +
                '}';
    }
}
