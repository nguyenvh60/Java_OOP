package KeThua;

public class Developer extends Employee {
    private String mainLanguage ;
    private int overtimeHour ;

    public Developer(String name, int age, String employeeId, double baseSalary , String mainLanguage, int overtimeHour) {
        super(name, age, employeeId, baseSalary);
        this.mainLanguage = mainLanguage;
        this.overtimeHour = overtimeHour;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage;
    }

    public int getOvertimeHour() {
        return overtimeHour;
    }

    public void setOvertimeHour(int overtimeHour) {
        this.overtimeHour = overtimeHour;
    }

    public double calculateTotalSalary() {
        return getBaseSalary() + getOvertimeHour() * 20000;
    }

    public void printDeveloperDetails() {
        super.printEmployeeInfo();
        System.out.println("Main Language: " + mainLanguage);
        System.out.println("Overtime Hour: " + overtimeHour);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}
