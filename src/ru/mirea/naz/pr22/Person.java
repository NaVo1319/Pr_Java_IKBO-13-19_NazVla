package ru.mirea.naz.pr22;

import java.util.ArrayList;

public class Person {
     private String name;
    private String INN;
    private ArrayList<Product> basket=new ArrayList<>();

    public Person(String name, String INN) {
        this.name = name;
        this.INN = INN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getINN() {
        return INN;
    }

    public void setINN(String INN) {
        this.INN = INN;
    }
    public void printBasket(){
        for(Product product: basket){
            System.out.println(product);
        }
    }

    public ArrayList<Product> getBasket() {
        return basket;
    }

    public void setBasket(ArrayList<Product> basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return name+" ИНН:"+INN;
    }
}
