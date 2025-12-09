package KeThua;

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }
    private double salary ;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void infoTeacher(){
        System.out.println("Teacher Name: " + this.getName());
        System.out.println("Teacher Age: " + this.getAge());
        System.out.println("Teacher Salary: " + this.getSalary());
    }
}
