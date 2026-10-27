package org.example.ClassObject;

public class Test {
    public static void main(String[] args) {
        // Object là một thực thể được tạo từ Class, có du liệu, trạng thái và hành vi
        // 1 Class có thể có nhiều Object

        // tự sinh 1 constructor mặc định nếu có constructor không tham số hoặc k tạo constructor
        Book book = new Book();

        // phải truyền đủ đối số nếu có constructor có tham số
//        Book book2 = new Book("Java","James",2000);
        // Book là kiểu dl tham chiếu, book là biến tham chiếu, new Book() là tạo 1 đôi tượng mới

        book.title = "Title1" ;
        book.author = "Author1" ;
        book.price = 12.5 ;
        // tham chiếu đến thuộc tính của đối tượng

        book.displayInfo(); // gọi phương thức

        Book book2 = book; // sao chép giá trị nên cả 2 biến cùng truy cập đến 1 đt

        book2.displayInfo() ;


    }

}
