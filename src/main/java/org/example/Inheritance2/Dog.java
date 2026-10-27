package org.example.Inheritance2;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(getName() + " is barking");
    }
}
