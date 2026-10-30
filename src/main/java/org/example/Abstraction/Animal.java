package org.example.Abstraction;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println(name + "đang ăn");
    }
    public abstract void makeSound();

}
