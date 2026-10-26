package org.example.ClassObject;

public class Book {
    // Class la kieu du lieu ma nguoi dung tu dinh nghia mo ta cau truc va hanh vi cua dt
    String title ;
    String author ;
    double price ;

    // neu khong tao constructor hoac co 1 constructor 0 tham so


    public Book() {
    }


    // neu co 1 constructor co tham so
//    public Book(String title, String author, double price) {
//        this.title = title;
//        this.author = author;
//        this.price = price;
//    }

    public void displayInfo(){
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
    }

}



