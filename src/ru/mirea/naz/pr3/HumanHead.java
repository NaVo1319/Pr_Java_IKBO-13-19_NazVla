package ru.mirea.naz.pr3;

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
