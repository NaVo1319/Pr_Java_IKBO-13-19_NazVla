package ru.mirea.naz.pr26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class City {
    Map<String, ArrayList<String>> map = new HashMap();
    public void add(String country,String city){
        if(map.get(country)!=null){
            ArrayList<String > x=map.get(country);
            x.add(city);
            map.put(country,x);
        }
        else{
            ArrayList<String > x=new ArrayList<>();
            x.add(city);
            map.put(country,x);
        }
    }

    @Override
    public String toString() {
        return map+"";
    }
}
