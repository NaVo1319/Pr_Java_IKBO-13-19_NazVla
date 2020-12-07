package ru.mirea.naz.pr30;

import java.util.Arrays;

public class ArrayQueue extends AbstractQueue implements Queue {
    private int[] mass;
    public ArrayQueue(int size){
        mass=new int[size];
        super.top=0;
        this.size=0;
        super. bottom=-1;
    }
    public void enqueue(int element){
        if(super.top==super.bottom){
            System.out.println("Ошибка: переполнение");
            return;
        }
        mass[super.top]=element;
        if(super.top== mass.length-1)super.top=0;
        else{super.top++;}
        super.size++;
    }
    public int element(){
        return mass[super.bottom];
    }
    public int dequeue(){
        if(super.bottom==-1)super.bottom++;
        int element=mass[super.bottom];
        if(super.bottom== mass.length-1)super.bottom=0;
        else{super.bottom++;}
        super.size--;
        return element;
    }
    public void clear(){
        super.top= 0;
        super.bottom=0;
        super.size=0;
        mass=new int[mass.length];
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "mass=" + Arrays.toString(mass) +
                ", top=" + super.top +
                ", bottom=" + super.bottom +
                ", size=" + super.size +
                '}';
    }
}
