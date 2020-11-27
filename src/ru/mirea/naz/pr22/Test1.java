package ru.mirea.naz.pr22;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Shop shop=new Shop(new Product("Дивана",120),new Product("Нога",560),new Product("Колбаса",2)
        ,new Product("Стол",60),new Product("Нож",12),new Product("Пакет",3),
         new Product("Носки",99999));
        shop.addTradeTrue("Петрович А.В","4567238945");
        shop.addTradeTrue("Иванов А.Ф","9012901245");
        shop.addTradeTrue("Сидоров И.К","0000000000");
        shop.printBasket();
        Scanner scan=new Scanner(System.in);
        String product="";
        Person Petr=new Person("X","X");
        while(true){
            product=scan.nextLine();
            if(product.equals("Купить"))break;
            shop.addBasket(product);
        }
        shop.payBasket(Petr);
        Petr.printBasket();

    }
}
