package org.example.ClassObject;

public class Test {
    public static void main(String[] args) {
        Book book = new Book(); // constructor rong mac dinh

       //  Book book4 = new Book("Python","gg",300);// phai truyen du doi so neu co 1 constructor co tham so
        // Book la kieu du lieu duoc tham chieu, book la bien tham chieu, new Book () la tao doi tuong moi

        book.title = "Java";
        book.author = "James";
        book.price = 3000 ;

        // bien tham chieu tro vao thuoc tinh doi tuong

        Book book2 = new Book();
        book2.title = "Javascript";
        book2.author = "James M";
        book2.price = 3000 ;

        Book book3 = book2 ; // sao chep gia tri tham chieu

        book.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}
