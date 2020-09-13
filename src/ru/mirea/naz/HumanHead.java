package ru.mirea.naz;

public class HumanHead {
    private int Health;
    public HumanHead(int health){Health=health;}

    public void setHealth(int health) {
        Health = health;
    }

    public int getHealth() {
        return Health;
    }
    @Override
    public String toString() {
        return Health+"/100";
    }
}
