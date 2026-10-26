package org.example.Encapsulation;

public class BankAccount {
    private String name ;
    private final String accountNumber ; // có final thì không thể gán lại biến
    private double balance;

    //private các thuộc tính nhằm k bị truy cập và thay đổi giá trị từ bên ngoài



    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        setBalance(balance); // để vào constructor check giá trị phải hợp lệ ngay từ khi tạo ra
    }

    // get lấy ra giá trị của 1 thuộc tính
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Tên không được trống");
        }
        this.name = name;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // set cho phep thay đổi giá trị của thuộc tính nhưng sẽ check input có hợp lệ không thì mới cho đổi
    public void setBalance(double balance) {
        if (balance < 0 ||
                Double.isNaN(balance)) {
            throw new IllegalArgumentException("Số dư không được âm");
        }
        this.balance = balance; // this phân biệt thanh viên của đối tượng với tham số
    }

    // vẫn để public để bên ngoài tương tác với các đối tượng
    //
    public void deposit(double amount) {
        if (amount < 0) {
           throw new IllegalArgumentException("Số tiền nạp bắt buộc lớn hơn 0");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            throw new IllegalArgumentException("Số tiền rút không hợp lệ");
        }
        this.balance -= amount;
    }
    public void displayInfo (){
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
