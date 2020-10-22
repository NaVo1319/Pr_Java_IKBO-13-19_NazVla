package ru.mirea.naz.pr15_16;

public class Test {
    public static void main(String[] args) {
        Collect mass=new Collect(98,3,5,8,34);
        System.out.println(mass);
        mass.add(56);
        mass.del(3);
        mass.del(8);
        mass.add(234);
        System.out.println(mass);
        System.out.println( "Поиск по индексу (2) "+mass.searchIndex(2));
        System.out.println("Поиск по значению (56) "+mass.search(56));
        System.out.println("Минимум "+mass.min());
        System.out.println("Максимум "+mass.max());
        System.out.println("Среднее значение "+mass.getSumMid());
    }
}
