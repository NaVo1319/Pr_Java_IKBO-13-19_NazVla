package ru.mirea.naz.pr25;

public class Test {
    public static void main(String[] args) {
        Student student=new Student("12.29.2020");
        System.out.println(student.toString("короткий"));
        System.out.println(student.toString("средний"));
        System.out.println(student.toString("полный"));

        Date date=new Date(2020,12,6,12,43);
        System.out.println(date);

        GetNowDate nowDate=new GetNowDate();
        nowDate.getDate();
    }
}
