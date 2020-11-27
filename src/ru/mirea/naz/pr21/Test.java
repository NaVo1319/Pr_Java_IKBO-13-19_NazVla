package ru.mirea.naz.pr21;

import java.util.Scanner;

public class Test {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2 / i );
    }
    public static void main(String[] args) {
        try{exceptionDemo();}
        catch (Exception e){
            System.out.println("Делить на 0 нельзя");
        }
        finally {
            System.out.println("Программа выполнена");
        }
    }
}
