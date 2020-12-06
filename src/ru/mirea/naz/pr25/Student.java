package ru.mirea.naz.pr25;

public class Student {
    private String date;
    public Student(String date){
        this.date=date;
    }
    public String toString(String format) {
        if(format.equals("короткий")){
            return date.substring(6,date.length());
        }
        if(format.equals("средний")){
            return date.substring(3,date.length());
        }
        if(format.equals("полный")){
            return date;
        }
        return "";
    }
}
