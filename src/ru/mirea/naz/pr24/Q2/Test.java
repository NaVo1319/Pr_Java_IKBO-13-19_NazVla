package ru.mirea.naz.pr24.Q2;

public class Test {
    public static void main(String[] args) {
        Fab fab=new Fab();
        Chair vicChair= fab.MakeVicChair("Стул","не раритет");
        Chair magicChair=fab.MakeMagicChair("Магический Стул","Магия!");
        Chair funcChair= fab.MakeFuncChair("Функциональный сту","Выполняет функцию");
        Client client=new Client();
        client.Sit(vicChair);
        System.out.println(vicChair);
        System.out.println(magicChair);
        System.out.println(funcChair);
        client.Stat();
    }
}
