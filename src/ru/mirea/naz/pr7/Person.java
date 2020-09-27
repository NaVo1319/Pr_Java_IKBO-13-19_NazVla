package ru.mirea.naz.pr7;

import java.util.ArrayList;

public class Person {
    private ArrayList<Furniture> basket;
    double money;

    public Person(double money) {
        this.basket = new ArrayList<>();
        this.money=money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Furniture> getBasket() {
        return basket;
    }

    public void setBasket(ArrayList<Furniture> basket) {
        this.basket = basket;
    }
    public void buy(String product, FurnitureShop shop){
        for(Furniture i:shop.getShop()){
            if(i.getName().equals(product)){
                if(money-i.getPrice()>=0) {
                    money -= i.getPrice();
                    shop.delShop(i);
                    basket.add(i);
                    break;
                }
                else{
                    System.out.println("Нет денег, иди работай");
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "basket=" + basket +
                '}';
    }
}
