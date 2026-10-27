package org.example.Inheritance3;

public class Test3 {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(10, 10),
                new Circle(3)
        };

        for (Shape s : shapes) {
            System.out.println(s.calculateArea());
        }
    }
}
