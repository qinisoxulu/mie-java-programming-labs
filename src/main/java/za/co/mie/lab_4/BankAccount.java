package za.co.mie.lab_4;

public class BankAccount {
    private String account_holder;
    private long account_number;
    private double account_balance;

    public BankAccount(String account_holder, long account_number){
        this.account_holder = account_holder;
        this.account_number = account_number;
        this.account_balance = 0.0;
    }

    public BankAccount(String account_holder, long account_number, double account_balance){
        this.account_holder = account_holder;
        this.account_number = account_number;
        this.account_balance = account_balance >= 0 ? account_balance : 0;
    };

    public void deposit(double amount){
        if (amount > 0) {
            this.account_balance += amount;
        } else {
            System.out.println("Please enter a valid amount.");
        }
    };

    public void withdraw(double amount){
        if (amount > 0) {
            if (this.account_balance - amount <= 0) {
                System.out.println("Please enter an amount between available balance and zero");
            } else {
                this.account_balance -= amount;
            }
        } else {
            System.out.println("Please enter a valid amount.");
        }
    };

    public double getBalance(){
        return this.account_balance;
    }
}
