package org.example.ClassObject;

public class Test {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert C. Martin", 250000);
        Book book2 = new Book("Effective Java", "Joshua Bloch", 300000);

        book.displayInfo();
        book2.displayInfo();



    }
}
