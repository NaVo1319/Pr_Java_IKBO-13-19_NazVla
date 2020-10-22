package ru.mirea.naz.pr15_16;

import java.util.Arrays;

public class Collect {
    private int[] mass;

    public Collect(int... numbers) {
        mass=numbers;
    }
    public void add(int x){
        int[] buff=new int[mass.length+1];
        for(int i=0;i< mass.length;++i){
            buff[i]=mass[i];
        }
        buff[mass.length]=x;
        mass=buff;
    }
    public void del(int x){
        for(int i=0;i< mass.length;++i){
            if(mass[i]==x){
                int[] buff=new int[mass.length-1];
                for(int j=i;j< mass.length-1;++j){
                    mass[j]=mass[j+1];
                }
                for(int k=0;k< mass.length-1;++k){
                    buff[k]=mass[k];
                }
                mass=buff;
                break;
            }
        }
    }
    public int searchIndex(int index){
        if(index< mass.length && index>0){
            return mass[index];
        }
        return 0;
    }
    public int search(int value){
        for(int i=0;i< mass.length;++i){
            if(mass[i]==value){
                return mass[i];
            }
        }
        return 0;
    }
    public int min(){
        int buff=mass[0];
        for(int i:mass){
            if(i<buff){
                buff=i;
            }
        }
        return buff;
    }
    public int max(){
        int buff=mass[0];
        for(int i:mass){
            if(i>buff){
                buff=i;
            }
        }
        return buff;
    }
    public double getSumMid(){
        int sum=0;
        for(int i: mass){
            sum+=i;
        }
        return (double) sum/mass.length;
    }
    @Override
    public String toString() {
        return "Collect{" +
                "mass=" + Arrays.toString(mass) +
                '}';
    }
}
