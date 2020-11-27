package ru.mirea.naz.pr22;

import ru.mirea.naz.pr13_14.SortingStudentByGPA;
import ru.mirea.naz.pr13_14.Student;

import java.util.Random;

import static ru.mirea.naz.pr13_14.Test.randMark;

public class Test2 {
    public static Student[] Enter(){
        String[] names=new String[]{"Петрови А.В","Александров Л.И","Кор Г.И","Омар У.Е","Глазуоь С.С","Просто Вася","Не просто Вася","Поттер Г.В","Ку"};
        int[] marks=new int[10];
        int size=10;
        Student[] students=new Student[size];
        Random rand=new Random();
        for(int i=0;i<size;++i){
            Student s1=new Student(i+1, randMark(marks));
            s1.setName(names[rand.nextInt(names.length)]);
            students[i]=s1;
        }
        return students;
    }
    public static void main(String[] args) {
        new GUIStudents(Enter());
    }
}
