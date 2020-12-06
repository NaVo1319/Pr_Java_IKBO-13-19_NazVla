package ru.mirea.naz.pr23;

import java.util.ArrayList;

public class Test1 {
    public  static ArrayList<Integer> toList(int[] x){
        ArrayList<Integer> y=new ArrayList<>();
        for(int i:x){
            y.add(i);
        }
        return y;
    }
    public static ArrayList<String> toList(String[] x){
        ArrayList<String> y=new ArrayList<>();
        for(String i:x){
            y.add(i);
        }
        return y;
    }
    public static void main(String[] args) {
        int[] x={1,2,3,4,5,6};
        String[] y={"a","b","c","d"};
        for(int i:toList(x)){
            System.out.printf(i+" ");
        }
        System.out.println();
        for(String i:toList(y)){
            System.out.printf(i+" ");
        }
    }
}
