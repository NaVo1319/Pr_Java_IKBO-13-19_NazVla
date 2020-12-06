package ru.mirea.naz.pr24.Q2;

public class Client implements Chair {
    Object Sit=null;
    String stat="Стоит";
    @Override
    public void Sit(Chair chair) {
        Sit=chair;
        if(Sit!=null){
            stat="Седит";
        }
        else {
            stat="стоит";
        }
    }

    @Override
    public void Stat() {
        System.out.println(stat);
    }
}
