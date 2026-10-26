package org.example.ClassObject;

public class Book {
        String title ;
        String author ;
        double price ;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayInfo(){
            System.out.println("title:"+ title);
            System.out.println("author:"+ author);
            System.out.println("price:"+ price);
        }
}



