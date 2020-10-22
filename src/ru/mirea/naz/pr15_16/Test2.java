package ru.mirea.naz.pr15_16;

public class Test2 {
    public static void main(String[] args) {
        DrinkerCard game=new DrinkerCard();
        game.setFirstPlayer(1,3,5,7,9);
        game.setSecondPlayer(2,4,6,8,0);
        game.gameResult();
    }
}
