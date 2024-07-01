package entities;


public class Client {
    private String name;
    private final int accountNumber;
    private double balance;

    public Client(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double deposit) {
        balance += deposit;
    }
    public void withdraw(double withdraw) {
        balance -= withdraw + 5;
    }
    public String toString() {
        return "Account data: " +
                "\nAccount: " + accountNumber +
                "\nName: " + name +
                "\nBalance: $" + String.format("%.2f", balance);
    }
    public String updatedToString() {
        return "Updated Account data: " +
                "\nAccount: " + accountNumber +
                "\nName: " + name +
                "\nBalance: $" + String.format("%.2f", balance);
    }
}
