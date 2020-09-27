package ru.mirea.naz.pr3;

public class HumanHand {
    private int Health;
    public HumanHand(int health){Health=health;}

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
