package ru.mirea.naz.pr56;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	MovableCircle circle=new MovableCircle("red",4,0,8);
	MoveRectangle rectangle=new MoveRectangle("grey",13,34, 1,1);
        System.out.println(circle);
        System.out.println(rectangle);
        circle.move(2,-4);
        rectangle.move(6,5);
        System.out.println(circle);
        System.out.println(rectangle);
    }
}
