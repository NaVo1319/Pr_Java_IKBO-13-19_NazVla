package ru.mirea.naz.pr25;

import java.util.Date;

public class GetNowDate {
    String name="Речной бобер";
    public void getDate(){
        Date date=new Date();
        System.out.println("\nИмя разработчика: "+name);
        System.out.println("Задание получено: "+date);
        date.setTime(date.getTime()+9990000);
        System.out.println("Задание сдано: "+date);
    }
}
