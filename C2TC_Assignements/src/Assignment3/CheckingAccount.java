package Assignment3;

// Another subclass of Account
public class CheckingAccount extends Account {

    public CheckingAccount(String accountHolder, int accountNumber) {
        super(accountHolder, accountNumber);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " into Checking Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from Checking Account.");
        } else {
            System.out.println("Insufficient balance in Checking Account.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
