package KeThua;

public class TestKeThua {
    public static void main(String[] args) {
        Student st = new Student("Nguyên", 21, "CNTT");
        st.study();
        st.printCountry();

        System.out.println("---------------------------------------------------------------");


        Employee emp = new Employee("Coder",21,500000);
        emp.displayInfoEmploye();
        emp.printCountry();
    }
}
