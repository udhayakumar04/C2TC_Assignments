package Assignment3;

// Abstract part: base class for accounts
public abstract class Account {
    protected String accountHolder;
    protected int accountNumber;
    protected double balance;

    public Account(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
        Bank.incrementAccountCount(); // increase count whenever account is created
    }

    // Abstract methods to be implemented by subclasses
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    // Common method
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

