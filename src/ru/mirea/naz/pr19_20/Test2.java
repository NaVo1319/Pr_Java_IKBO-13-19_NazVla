package ru.mirea.naz.pr19_20;

import java.io.*;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Test2 {
    public static void topWord(){
        try(BufferedReader reader=new BufferedReader(new FileReader(new File(".\\src\\ru\\mirea\\naz\\pr19_20\\Война и мир(Test1).txt")))) {
            String[] str;
            String s;
            Map<String, Integer> top = new TreeMap<>();
            while((s= reader.readLine())!=null){
                if(!s.isEmpty()){
                    str = s.replaceAll("[^a-zA-ZА-Яа-я- ]", "").toLowerCase().split("\\s+");
                    for (String i : str) {
                        if (top.containsKey(i)) {
                            top.put(i, top.get(i) + 1);
                        } else {
                            top.put(i, 1);
                        }
                    }
                }
            }
            int i=0;
            Map<Integer, String> result = new TreeMap<>((Collections.reverseOrder()));
            for (Map.Entry e : top.entrySet()) {
                result.put((int)e.getValue(),""+e.getKey());
            }
            System.out.println("Самые часто встречающееся слова:");
            for (Map.Entry e : result.entrySet()) {
                if(i==10)break;
                System.out.println(e.getValue()+": "+e.getKey());
                i++;
            }
        }
        catch (IOException e) {
        e.printStackTrace();
    }
    }
    public static void replaceSymbol(String symbol){
        File buff=new File(".\\src\\ru\\mirea\\naz\\pr19_20\\Война и мир(Buff).txt");
        File test2=new File(".\\src\\ru\\mirea\\naz\\pr19_20\\Война и мир(Test2).txt");
        try(FileWriter writer=new FileWriter(buff);
            FileReader r=new FileReader(test2)){
            String str;
            int i=0;
            BufferedReader reader=new BufferedReader(r);
            System.out.println("Пробелы заменены на "+symbol+" :");
            while ((str=reader.readLine())!=null){
                str=str.replaceAll("\\s+", symbol);
                writer.write(str+"\n");
                if(i<=10){
                    System.out.println(str);
                    i++;
                }
            }
            reader.close();
            writer.close();
            test2.delete();
            if(buff.renameTo(new File(".\\src\\ru\\mirea\\naz\\pr19_20\\Война и мир(Test2).txt"))){
                System.out.println("Файл переименован успешно");;
            }else{
                System.out.println("Файл не был переименован");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        topWord();
        replaceSymbol("#");
    }
}
