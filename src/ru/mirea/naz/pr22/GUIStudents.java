package ru.mirea.naz.pr22;

import ru.mirea.naz.pr13_14.SortingStudentByGPA;
import ru.mirea.naz.pr13_14.Student;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUIStudents extends JFrame {
    JButton buttonSort=new JButton("Сортировать");
    JButton buttonSearch=new JButton("Поиск");
    JTextField textSearch=new JTextField(12);
    JTextPane textOut=new JTextPane();
    JTextPane textOutSearch=new JTextPane();
    public void SearchName(Student[] students,String name){
        for (int index = 0; index < students.length; index++) {
            if (students[index].getName().contains(name)) {
                textOutSearch.setText(students[index] + "");
                return;
            }
        }
        textOutSearch.setText("Не найдено");
    }
     public GUIStudents(Student[] students){
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setVisible(true);
         this.setResizable(false);
         this.setBounds(100,100,600,500);
         this.setVisible(true);
         Container con=this.getContentPane();
         con.setLayout (new FlowLayout(FlowLayout.CENTER));
         buttonSort.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 SortingStudentByGPA sort=new SortingStudentByGPA();
                 Student[] buff;
                 buff=sort.QuickSort(students);
                 String text="";
                 for(int i=0;i<buff.length;++i){
                     text+=buff[i]+"\n";
                     System.out.println(buff[i]);
                 }
                 textOut.setText(text);
             }
         });
         buttonSearch.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 SortingStudentByGPA sort=new SortingStudentByGPA();
                 String regex = "\\d+";
                 if(textSearch.getText().matches(regex)) {
                     textOutSearch.setText(sort.linearSearch(students, Integer.parseInt(textSearch.getText())) + "");
                 }
                 else{
                     SearchName(students, textSearch.getText());
                 }
             }
         });
         con.add(buttonSort);
         con.add(textSearch);
         con.add(buttonSearch);
         con.add(textOut);
         con.add(textOutSearch);
         textOutSearch.setText("_____________");
         String text="";
         for(int i=0;i<students.length;++i){
             text+=students[i]+"\n";
         }
         textOut.setText(text);
    }
}
