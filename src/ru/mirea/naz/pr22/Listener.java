package ru.mirea.naz.pr22;

import ru.mirea.naz.pr13_14.SortingStudentByGPA;
import ru.mirea.naz.pr13_14.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener {
    JTextField textSearch;
    JTextArea textOut;
    Student[] students;
     public Listener(JTextField textSearch, JTextArea textOut, Student[] students){
        this.textOut=textOut;
        this.textSearch=textSearch;
        this.students=students;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        SortingStudentByGPA sort=new SortingStudentByGPA();
        sort.QuickSort(students);
    }
}
