package ru.mirea.naz.pr27;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
    public static void main(String[] args) {
        Person person1=new Person("Куль","Иван","Иваныч");
        Person person2=new Person("Куль","Иван",null);
        Person person3=new Person("Куль",null,null);
        System.out.println(person1.getFNO());
        System.out.println(person2.getFNO());
        System.out.println(person3.getFNO());

        String address="Россия Москва Москва Ленина 2 3 345";
        Address add=new Address();
        add.setAddressS(address);
        System.out.println(add);
        address="Россия-Москва-Москва-Ленина-2-3-345";
        add.setAddressT(address);
        System.out.println(add);

        String[] shirts=new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt shirt=new Shirt(shirts);
        System.out.println(shirt);

        Telefon telefon=new Telefon("89163887896");
        System.out.println(telefon);
        telefon=new Telefon("+129163887896");
        System.out.println(telefon);
        telefon=new Telefon("+79163887896");
        System.out.println(telefon);

        File file=new File("src\\ru\\mirea\\naz\\pr27\\pr27.txt");
        GetLine line=new GetLine();
        try {
            FileReader fileReader=new FileReader(file);
            BufferedReader reader=new BufferedReader(fileReader);
            String str;
            str=reader.readLine();
            System.out.println(line.getLine(str.split(" ")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
