package KeThua;

public class Employee extends Person {
    private String employeeId;
    private double baseSalary;

    public Employee(String name, int age, String employeeId, double baseSalary) {
        super(name, age);
        this.employeeId = employeeId;
        setBaseSalary(baseSalary);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        validateBaseSalary(baseSalary);
        this.baseSalary = baseSalary;
    }

    private void validateBaseSalary(double baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base Salary should be greater than 0");
        }
    }

    public void printEmployeeInfo(){
        super.printBasicInfo();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Base Salary: " + baseSalary);
    }


}
