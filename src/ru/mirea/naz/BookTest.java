package ru.mirea.naz;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Ocean", "Bobr", 1956);
        System.out.println(book);
        book.setAuthor("not Bobr");
        book.setName("not Ocean");
        book.setYear(666);
        System.out.println(book);
    }
}
