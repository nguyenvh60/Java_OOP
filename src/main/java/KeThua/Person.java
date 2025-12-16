package KeThua;
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    private void validateAge (int age){
        if (age < 18){
            throw new IllegalArgumentException("Age must be greater than 18");
        }
    }

    public void printBasicInfo (){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


}
