package ru.mirea.naz.pr27;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shirt {
    private ArrayList<String> mass=new ArrayList<>();
    private ArrayList<String> comment= new ArrayList<>();
    public Shirt(String[] m){
        String[] buff;
        for(String x:m){
            buff=x.split(",",2);
            mass.add(buff[0]);
            comment.add(buff[1]);
        }
    }

    @Override
    public String toString() {
        String result="";
        for(int i=0;i< mass.size();++i){
            result+= mass.get(i)+" -> "+comment.get(i)+"\n";
        }
        return result;
    }
}
