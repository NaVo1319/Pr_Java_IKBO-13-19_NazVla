package ru.mirea.naz.pr1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] A={1,2,3,4,5,6,7};
        int i;
        int S=0;
        //Задание №1
        for(i=0;i<A.length;++i){
            S+=A[i];
        }
        System.out.println(S);
        S=0;
        i=0;
        //
        while(i<A.length){
            S+=A[i];
            ++i;
        }
        System.out.println(S);
        S=0;
        //
        i=0;
        do{
            S+=A[i];
            ++i;
        }while(i<A.length);
        System.out.println(S);
        //Задание #2
        for(i=0;i<args.length;++i){
            System.out.println(args[i]);
        }
        //Задание №3
        double k;
        for(i=1;i<=10;++i){
            k=i;
            System.out.printf("%5.2f",1/k);
        }
        //Задание №4
        Random rand=new Random();
        for(i=0;i<A.length;++i){
            A[i]=rand.nextInt(10);
            System.out.println(A[i]);
        }
        for(i=0;i<A.length;++i){
            System.out.printf("%6.3f",0+Math.random()*10);
        }
        //Задание №3
        System.out.printf("\nF!=%d",fact(3));
    }
    static int fact(int F){
        int S=1;
        for(int i=2;i<=F;++i){
            S=S*i;
        }
        return S;
    }
}