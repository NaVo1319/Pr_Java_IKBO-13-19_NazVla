package ru.mirea.naz.pr15_16;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DrinkerCard {
    private ArrayList<Integer> firstPlayer;
    private ArrayList<Integer> secondPlayer;
    public DrinkerCard() {
        firstPlayer=new ArrayList<>();
        secondPlayer=new ArrayList<>();
    }

    public void setFirstPlayer(int... first) {
        for(int i:first){
            firstPlayer.add(i);
        }
    }

    public void setSecondPlayer(int...second) {
        for(int i:second){
            secondPlayer.add(i);
        }
    }
    public void gameResult(){
        for(int i=1;i<106;++i){
            if(firstPlayer.get(0)<secondPlayer.get(0)){
                int firstCard=firstPlayer.get(0),secondCard=secondPlayer.get(0);
                firstPlayer.remove(0);
                secondPlayer.remove(0);
                secondPlayer.add(firstCard);
                secondPlayer.add(secondCard);
            }
            else if(firstPlayer.get(0)==9 && secondPlayer.get(0)==0){
                int firstCard=firstPlayer.get(0),secondCard=secondPlayer.get(0);
                firstPlayer.remove(0);
                secondPlayer.remove(0);
                secondPlayer.add(firstCard);
                secondPlayer.add(secondCard);
            }
            else {
                int firstCard=firstPlayer.get(0),secondCard=secondPlayer.get(0);
                firstPlayer.remove(0);
                secondPlayer.remove(0);
                firstPlayer.add(firstCard);
                firstPlayer.add(secondCard);
            }
            if(firstPlayer.size()==0 || secondPlayer.size()==0){
                if(firstPlayer.size()==0){
                    System.out.println("second "+i);
                }
                else{
                    System.out.println("first "+i);
                }
                return;
            }
        }
        System.out.println("botva");
        return;
    }
}
