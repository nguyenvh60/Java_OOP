package DaHinh;

public class Test {
    public static void main(String[] args) {
      Employee [] employees = {
              new PartTimeEmployee("ABC",3,1000),
              new FullTimeEmployee("DEF",30000),
      };
      for (Employee employee : employees) {
          System.out.println(employee.calculateSalary());
      }
    }
}
