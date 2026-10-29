package org.example.Polymorphism2;

public class FullTimeEmployee extends Employee {
    private final double baseSalary;

    public FullTimeEmployee(double baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException(
                    "Base salary cannot be negative"
            );
        }

        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}
