package ru.mirea.naz;

public class HumanLeg {
    private int Health;
    public HumanLeg(int health){Health=health;}


    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    @Override
    public String toString() {
        return Health+"/100";
    }
}
