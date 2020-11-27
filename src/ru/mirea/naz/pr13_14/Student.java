package ru.mirea.naz.pr13_14;

import java.util.Comparator;

public class Student {
     private int IDNumber;
     private int[] marks;
     private String name;
     public Student(int id,int[] x){
        this.IDNumber=id;
        marks=x;
    }

    public int getID() {
        return IDNumber;
    }

    public void setID(int ID) {
        this.IDNumber = ID;
    }

    public int[] getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public String printMark(){
        String a="";
        int sum=0;
        for(int i:marks){
           a+=i+", ";
           sum+=i;
       }
        a+="Среднее значение: "+sum/ marks.length+"";
        return a;
    }
    @Override
    public String toString() {
        return "ID: "+IDNumber+", |"+name+"| Marks: "+printMark();
    }

}
