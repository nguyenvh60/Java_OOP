package org.example.ClassObject;

public class Book {
    // Class là 1 kiểu dữ liệu người dùng tự định nghiã, mô tả cấu trúc và hành vi của dối tượng
    String title ;
    String author;
    double price ;


//    Nếu có constructor có tham số thì ...
//    public Book(String title, String author, double price) {
//        this.title = title;
//        this.author = author;
//        this.price = price;
//    }

// Nếu có constructor không tham số hoặc không có constructor thì ...
    public Book() {
    }

    public void displayInfo(){
        System.out.println("Book title: " + title);
        System.out.println("Book author: " + author);
        System.out.println("Book price: " + price);
    }


}



