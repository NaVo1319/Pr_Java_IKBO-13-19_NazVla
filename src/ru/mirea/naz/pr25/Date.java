package ru.mirea.naz.pr25;

import java.util.Arrays;

public class Date {
    int year;
    int month;
    int date;
    int hour;
    int minute;
    Calendar week;
    public Date(int year, int month, int date,int hour,int minute) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.hour=hour;
        this.minute=minute;
        week=new Calendar(date);
    }

    @Override
    public String toString() {
        return "Date : "+hour+":"+minute+" "+date+"."+month+"."+year+"\n Неделя "+ week;
    }
}
