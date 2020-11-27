package ru.mirea.naz.pr22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Shop {
    private ArrayList<Product> personBasket=new ArrayList<>();
    private ArrayList<Product> basket=new ArrayList<>();
    private HashMap<String,String> TradeTrue=new HashMap<>();

    public Shop(Product... basket) {
        for(Product product:basket){
            this.basket.add(product);
        }
    }
    public void printBasket(){
        for(Product product: basket){
            System.out.println(product);
        }
    }
    public void printPersonBasket(){
        for(Product product: personBasket){
            System.out.println(product);
        }
    }
    public void addTradeTrue(String name, String INN){
        TradeTrue.put(INN,name);
    }
    public void addBasket(String name){
        for(Product product: basket){
            if(product.getName().equals(name)){
                personBasket.add(product);
                System.out.println("Товар добавлен");
                return;
            }
        }
        System.out.println("Товар не найден");
    }
    public void payBasket(Person person){
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите ФИО:");
        String name=scan.nextLine();
        System.out.println("Введите ИНН:");
        String INN=scan.nextLine();
        if(TradeTrue.containsKey(INN)){
            if(name.equals(TradeTrue.get(INN))){
                System.out.println("Покупка совершена");
                person.setBasket(personBasket);
                this.basket.clear();
                return;
            }
            else {
                System.out.println("ИНН не принадлежит данному ФИО");
            }
        }
        else {
            System.out.println("ИНН не найден");
        }

    }

}
