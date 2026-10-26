package org.example.Encapsulation;

public class Test {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("ABC","91831",900);
        ba.deposit(100);
        ba.displayInfo();
        ba.withdraw(200);
        ba.displayInfo();


        // khi đặt private final sẽ không thể có setter cho accountNumber

    }
}
