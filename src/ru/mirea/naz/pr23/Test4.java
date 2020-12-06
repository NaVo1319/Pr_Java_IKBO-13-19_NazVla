package ru.mirea.naz.pr23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test4 {
    public static <T> ArrayList<T> newList(T ... x){
        ArrayList<T> list=new ArrayList<>();
        for(T i:x){
            list.add(i);
        }
        return list;
    }
    public static <T> HashSet<T> newHashSet(T ... x){
        HashSet<T> hash=new HashSet<>();
        for(T i:x){
            hash.add(i);
        }
        return hash;
    }
    public static <T,L>HashMap<T,L> newHashMap(T[] x, L[] y){
        HashMap<T,L> map=new HashMap<>();
        for(int i=0;i<x.length;++i){
            map.put(x[i],y[i]);
        }
        return map;
    }

    public static void main(String[] args) {
        ArrayList<Integer> x1=newList(1,2,3,4,5,6);
        HashSet<Integer> x2=newHashSet(1,2,3,4,5,6);
        String[] a={"Один","Два","Три","Четыре"};
        Integer[] b={1,2,3,4};
        HashMap<String,Integer> x3=newHashMap(a,b);
        for(int i=0;i<x1.size();++i){
            System.out.printf(x1.get(i)+" ");
        }
        System.out.println();
        for(int i:x2){
            System.out.printf(i+" ");
        }
        System.out.println();
        for(int i=0;i<x3.size();++i){
            System.out.printf(x3.get(a[i])+" ");
        }
    }
}
