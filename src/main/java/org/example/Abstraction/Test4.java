package org.example.Abstraction;

public class Test4 {
    public static void main(String[] args) {
       Animal [] animal = {
               new Dog("ky"),
               new Cat("Mun")
       };

       for (Animal a : animal) {
           a.makeSound();
           a.eat();
       }
    }
}
