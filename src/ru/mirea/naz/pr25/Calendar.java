package ru.mirea.naz.pr25;

import java.util.Arrays;

public class Calendar {
    int[] week={1,2,3,4,5,6,7};
    public Calendar(int date){
        date-=3;
        for(int i=0;i<7;++i){
            if(date<=0){
                week[i]=31-date;
            }
            else {
                week[i]=date;
            }
            date++;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(week);
    }
}
