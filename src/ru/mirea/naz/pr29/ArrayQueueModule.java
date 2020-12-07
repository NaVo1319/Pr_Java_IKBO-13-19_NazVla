package ru.mirea.naz.pr29;

import java.util.Arrays;

public class ArrayQueueModule {
    private int[] mass;
    private int top;
   private int bottom;
   private int size;
   public ArrayQueueModule(int size){
       mass=new int[size];
       top=0;
       this.size=0;
       bottom=-1;
   }
   public void enqueue(int element){
       if(top==bottom){
           System.out.println("Ошибка: переполнение");
           return;
       }
       mass[top]=element;
       if(top== mass.length-1)top=0;
       else{top++;}
       size++;
   }
   public int element(){
       return mass[bottom];
   }
   public int dequeue(){
       if(bottom==-1)bottom++;
       int element=mass[bottom];
       if(bottom== mass.length-1)bottom=0;
       else{bottom++;}
       size--;
       return element;
   }
   public int size(){
       return size;
   }
   public boolean isEmpty(){
       if(mass.length==0)return true;
       return false;
   }
   public void clear(){
       top= 0;
       bottom=0;
       size=0;
       mass=new int[mass.length];
   }

    @Override
    public String toString() {
        return "ArrayQueueModule{" +
                "mass=" + Arrays.toString(mass) +
                ", top=" + top +
                ", bottom=" + bottom +
                '}';
    }
}
