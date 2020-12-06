package ru.mirea.naz.pr23;

import ru.mirea.naz.pr8.Test;

import java.util.Arrays;

public class Test2<T> {
    private Object[] mass;
    public Test2(T[] x){
        mass=x;
    }
    public void add(T x){
        Object[] buff=new Object[mass.length+1];
        for(int i=0;i< mass.length;++i){
            buff[i]=mass[i];
        }
        buff[mass.length]=x;
        mass=(buff);
    }
    @Override
    public String toString() {
        return "Test2{" +
                "mass=" + Arrays.toString(mass) +
                '}';
    }

    public static void main(String[] args) {
        Integer[] mass={1,2,3,4,5};
        String[] string={"a","b","c","d"};
        Long[] longMass={1223423L,2313213423544L,3434252345L,56443252345L};
        Test2<Integer> x1=new Test2<Integer>(mass);
        Test2<String> x2=new Test2<>(string);
        Test2<Long> x3=new Test2<Long>(longMass);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
