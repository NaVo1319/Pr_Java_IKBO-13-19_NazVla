package ru.mirea.naz.pr23;

import java.io.File;
import java.util.ArrayList;

public class Test3 {
    public static ArrayList<File> listFilesForFolder(String x) {
        final File folder = new File(x);
        ArrayList<File> result=new ArrayList<>();
        for (final File fileEntry : folder.listFiles()) {
            result.add(fileEntry);
        }
        for(int i=0;i<5;++i){
            System.out.println(result.get(i).getName());
        }
        return result;
    }

    public static void main(String[] args) {
        listFilesForFolder("C:\\Users\\ЦУК\\Desktop\\HTML\\Курсовая");
    }
}
