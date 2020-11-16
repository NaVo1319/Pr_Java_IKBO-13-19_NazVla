package ru.mirea.naz.pr19_20;

import java.io.*;
import java.util.Scanner;

public class Test1 {
    //Вывести файл на экран
    public static void readFile(File file){
        try(BufferedReader reader=new BufferedReader(new FileReader(file))){
            String str;
            while((str=reader.readLine())!=null){
                System.out.println(str);
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Записать данные в файл
    public static void writeFile(File file){
        try(FileWriter writer=new FileWriter(file)){
            writer.write("Анна Павловна почти закрыла глаза в знак того, что ни она, ни кто другой не могут\n");
            writer.write("И она улыбнулась своею восторженною улыбкой.\n");
            writer.write("Вы никогда не думали о том, чтобы женить вашего блудного сына Анатоля? Говорят,\n");
            writer.write("Князь Василий не отвечал, хотя с свойственною светским людям быстротой\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Зменить данные в файле
    public static void replaceInfo(File file){
        Scanner scan=new Scanner(System.in);
        try(FileWriter writer=new FileWriter(file,false)){
            writer.write(scan.nextLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //Добавить строку в конец файла
    public static void addLine(File file){
        Scanner scan=new Scanner(System.in);
        try(FileWriter writer=new FileWriter(file,true)){
            writer.write(scan.nextLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        File file=new File("PR19-20.txt");
        //Записать данные в файл
        writeFile(file);
        //Добавить строку в конец файла
        addLine(file);
        //Вывести файл на экран
        readFile(file);
        //Заменить данные в файле
        replaceInfo(file);
        readFile(file);
    }
}
