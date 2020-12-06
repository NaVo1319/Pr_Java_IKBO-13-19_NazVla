package ru.mirea.naz.pr26;

public class Test {

    public static void main(String[] args) {
        Dictionary dictionary=new Dictionary();
        dictionary.add("Ряполь","Ал");
        dictionary.add("Кундир","Григорий");
        dictionary.add("Кунтир","Григорий");
        dictionary.add("Курег","Иван");
        dictionary.add("Марсен","Иван");
        dictionary.add("Загор","Куль");
        dictionary.add("Сину","Иван");
        System.out.println(dictionary);
        dictionary.delCloneValue();
        System.out.println(dictionary);

        City city=new City();
        city.add("Россия","Москва");
        city.add("Россия","Питербург");
        city.add("Россия","Саратов");
        city.add("США","Вашингтон");
        System.out.println(city);
    }
}
