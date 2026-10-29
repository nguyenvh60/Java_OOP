package org.example.Polymorphism2;

public class PartTimeEmployee extends Employee {
    private final double hourlyRate;
    private final double hoursWorked;

    public PartTimeEmployee(double hourlyRate, double hoursWorked) {
        if (hourlyRate < 0 || hoursWorked < 0) {
            throw new IllegalArgumentException(
                    "Hourly rate and hours cannot be negative"
            );
        }

        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
