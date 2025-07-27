package Assignment3;

// Subclass of Account
public class SavingsAccount extends Account {

    public SavingsAccount(String accountHolder, int accountNumber) {
        super(accountHolder, accountNumber);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " into Savings Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
