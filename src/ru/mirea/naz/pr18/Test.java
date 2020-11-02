package ru.mirea.naz.pr18;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void n1(){
        int x=42;
        int del=2;
        System.out.printf(x+"="+"1");
        while(x>1){
            while(x%del==0){
                x=x/del;
            }
            System.out.printf("*"+del);
            del++;
        }
        System.out.println();
    }
    public static void n2(String word){
        if(word.length()>1) {
            if (word.charAt(0) == word.charAt(word.length() -1)) {
                n2(word.substring(1, word.length() - 1));
                return;
            }
            else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
    public static int n3(){
        Scanner scan=new Scanner(System.in);
        int x= scan.nextInt();
        if(x!=0){
            return Math.max(x,n3());
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        n1();
        n2("wasitacaroracatisaw");
        System.out.println(n3());
    }
}
