package Assignment6;
import java.util.Scanner;

//Custom exception for invalid amounts
class InvalidAmountException extends Exception {
 public InvalidAmountException(String message) {
     super(message);
 }
}

//Custom exception for insufficient balance
class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

//BankAccount class
class BankAccount {
 private int accountNumber;
 private double balance;

 public BankAccount(int accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
 }

 public void deposit(double amount) throws InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Deposit amount must be greater than 0.");
     }
     balance += amount;
     System.out.println("₹" + amount + " deposited successfully.");
 }

 public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
     if (amount <= 0) {
         throw new InvalidAmountException("Withdrawal amount must be greater than 0.");
     }
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient balance for withdrawal.");
     }
     balance -= amount;
     System.out.println("₹" + amount + " withdrawn successfully.");
 }

 public void displayBalance() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Current Balance: ₹" + balance);
 }
}

//Main class
public class BankSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     BankAccount account = new BankAccount(1001, 5000.0);

     while (true) {
         System.out.println("\n--- BANK MENU ---");
         System.out.println("1. Deposit");
         System.out.println("2. Withdraw");
         System.out.println("3. Display Balance");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");

         int choice = scanner.nextInt();
         double amount;

         switch (choice) {
             case 1:
                 System.out.print("Enter deposit amount: ");
                 amount = scanner.nextDouble();
                 try {
                     account.deposit(amount);
                 } catch (InvalidAmountException e) {
                     System.out.println("Error: " + e.getMessage());
                 } finally {
                     account.displayBalance();
                 }
                 break;

             case 2:
                 System.out.print("Enter withdrawal amount: ");
                 amount = scanner.nextDouble();
                 try {
                     account.withdraw(amount);
                 } catch (InvalidAmountException | InsufficientFundsException e) {
                     System.out.println("Error: " + e.getMessage());
                 } finally {
                     account.displayBalance();
                 }
                 break;

             case 3:
                 account.displayBalance();
                 break;

             case 4:
                 System.out.println("Exiting... Thank you!");
                 scanner.close();
                 return;

             default:
                 System.out.println("Invalid choice. Try again.");
         }
     }
 }
}
