package ru.mirea.naz.pr7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Furniture chair=new chair("Стул","1.09.2019",800,"Дуб",4);
        Furniture bed=new Bed("Кровать","7.11.2019",2000,"Берёза","Односпальная");
        Furniture table=new Table("Стол","5.05.2020",5000,"Железо",10,5);
        Furniture cupboard=new Сupboard("Шкаф","1.05.2020",7500,"Дуб",2);
        FurnitureShop shop=new FurnitureShop(cupboard,bed,chair,table);
        Person person=new Person(51000);
        String product="";
        System.out.println(shop);
        System.out.println(person);
        while (true){
            product= scanner.nextLine();
            if(product.equals("выход")){break;}
            person.buy(product,shop);
        }
        System.out.println(shop);
        System.out.println(person);
    }
}
