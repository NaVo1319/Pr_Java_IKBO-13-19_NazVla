package ru.mirea.naz.pr29;

import java.util.Arrays;

public class ArrayQueueADT {
    private int[] mass;
    private int top;
    private int bottom;
    private int size;
    public ArrayQueueADT(int size){
        mass=new int[size];
        top=0;
        this.size=0;
        bottom=-1;
    }
    public void enqueue(ArrayQueueADT q,int element){
        if(q.top==q.bottom){
            System.out.println("Ошибка: переполнение");
            return;
        }
        q.mass[q.top]=element;
        if(q.top== q.mass.length-1)q.top=0;
        else{q.top++;}
        q.size++;
    }
    public int element(ArrayQueueADT q){
        return q.mass[bottom];
    }
    public int dequeue(ArrayQueueADT q){
        if(q.bottom==-1)q.bottom++;
        int element=q.mass[bottom];
        if(q.bottom== q.mass.length-1)q.bottom=0;
        else{q.bottom++;}
        q.size--;
        return element;
    }
    public int size(ArrayQueueADT q){
        return q.size;
    }
    public boolean isEmpty(ArrayQueueADT q){
        if(q.mass.length==0)return true;
        return false;
    }
    public void clear(ArrayQueueADT q){
        q.top= 0;
        q.bottom=0;
        q.size=0;
        q.mass=new int[q.mass.length];
    }

    @Override
    public String toString() {
        return "ArrayQueueADT{" +
                "mass=" + Arrays.toString(mass) +
                ", top=" + top +
                ", bottom=" + bottom +
                ", size=" + size +
                '}';
    }
}
