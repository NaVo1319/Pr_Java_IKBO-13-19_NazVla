package ru.mirea.naz.pr26;

import java.util.*;

public class Dictionary {
    Map<String,String> dictionary=new HashMap<>();
    public void add(String a,String b){
        dictionary.put(a,b);
    }
    public  void delCloneValue(){
        Map<String, String> NewHashMap = new HashMap<>();
        Map<String, String> HashMap = new HashMap<>();
        ArrayList<String> names=new ArrayList<>();
        boolean stat=true;
        for(Map.Entry<String, String> entry :dictionary.entrySet()){
            for(String name: names){
                if(entry.getValue().equals(name)){
                    stat=false;
                    for(Map.Entry<String, String> entry2 :NewHashMap.entrySet()){
                        if(!entry2.getValue().equals(name)){
                            HashMap.put(entry2.getKey(),entry2.getValue());
                        }
                    }
                    NewHashMap=HashMap;
                    break;
                }
                else {stat=true;}
            }
            names.add(entry.getValue());
            if(stat==true){
                NewHashMap.put(entry.getKey(),entry.getValue());
            }
        }
        String s="";
        for(Map.Entry<String, String> entry2 :NewHashMap.entrySet()){
            if(entry2.getValue().equals(names.get(0))){
                s=entry2.getKey();
            }
        }
        NewHashMap.remove(s+"");
        dictionary=NewHashMap;
    }

    @Override
    public String toString() {
        return dictionary+"";
    }
}
