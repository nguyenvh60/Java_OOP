package org.example.Polymorphism2;

public class Test {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee(20_000_000),
                new PartTimeEmployee(100_000, 8)
        };

        for (Employee employee : employees) {
            System.out.println(employee.calculateSalary());
        }
    }
}
