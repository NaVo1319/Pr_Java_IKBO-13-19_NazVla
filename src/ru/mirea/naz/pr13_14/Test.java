package ru.mirea.naz.pr13_14;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] marks=new int[10];
        Student[] IDNumber=new Student[5];
        Random rand=new Random();
        IDNumber[0]=new Student(1,3,4,5,3,4);
        IDNumber[1]=new Student(2,2,2,2,2,2);
        IDNumber[2]=new Student(3,5,5,5,5,5);
        IDNumber[3]=new Student(4,4,4,4,4,4);
        IDNumber[4]=new Student(5,2,5,5,3,3);
        for(int j=0;j<IDNumber.length;++j){
            System.out.println(IDNumber[j]);
        }
        System.out.println("----------");
        SortingStudentByGPA sort=new SortingStudentByGPA();
        sort.QuickSort(IDNumber);
        for(int j=0;j<IDNumber.length;++j){
            System.out.println(IDNumber[j]);
        }
    }
}
