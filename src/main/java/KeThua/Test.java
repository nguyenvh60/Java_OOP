package KeThua;

public class Test {
    public static void main(String[] args) {
        Student st = new Student("Nguyên", 21, "CNTT");
        st.infoStudent();
        st.displayInfoCountry();

        System.out.println("-----------------------------------------------");
        Teacher teacher = new Teacher("Vũ Nguyên Coder" , 31 , 6000000);
        teacher.infoTeacher();
        teacher.displayInfoCountry();
    }
}
