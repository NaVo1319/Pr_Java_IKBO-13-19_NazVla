package ru.mirea.naz.pr7;

import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> shop=new ArrayList<>();

    public FurnitureShop(Furniture ... shop) {
        for(Furniture i:shop){
            this.shop.add(i);
        }
    }

    public ArrayList<Furniture> getShop() {
        return shop;
    }

    public void setShop(ArrayList<Furniture> shop) {
        this.shop = shop;
    }
    public void addShop(Furniture product){
        this.shop.add(product);
    }
    public void delShop(Furniture product){
        shop.remove(product);
    }

    @Override
    public String toString() {
        return "FurnitureShop{" +
                "shop=" + shop +
                '}';
    }
}
