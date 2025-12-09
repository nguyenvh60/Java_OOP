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

    public void infoStudent(){
        System.out.println("Name : " + this.getName());
        System.out.println("Age : " + this.getAge());
        System.out.println("Major : " + this.major);
    }


}
