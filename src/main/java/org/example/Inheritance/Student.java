package org.example.Inheritance;

public class Student extends Person {
    private String studentId ;
    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }


    void displayInfoStudent() {
        System.out.println("Id : " + studentId);
        System.out.println("Name : " +getName());
        System.out.println("Age : " +getAge());
    }


}
