package KeThua;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }
    private String major ;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void study(){
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Major : " + major);
    }
}
