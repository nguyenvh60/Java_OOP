package KeThua;

public class Employee extends Person {
    public Employee(String name, int age) {
        super(name, age);
    }

    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayInfoEmploye(){
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Salary: " + this.salary);
    }
}
