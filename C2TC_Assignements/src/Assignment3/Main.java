package Assignment3;

// Main class to test everything
public class Main {
    public static void main(String[] args) {
        // Creating account objects
        SavingsAccount sa = new SavingsAccount("Udhaya Kumar", 1001);
        CheckingAccount ca = new CheckingAccount("Rahul Sharma", 2001);

        // Display initial account info
        System.out.println("=== Initial Account Info ===");
        sa.displayAccountInfo();
        ca.displayAccountInfo();

        // Transaction instance
        Transaction transaction = new Transaction();

        // Performing transactions
        transaction.performTransaction(sa, "deposit", 1000);
        transaction.performTransaction(ca, "deposit", 500);

        transaction.performTransaction(sa, "withdraw", 200);
        transaction.performTransaction(ca, "withdraw", 600);

        // Final account info
        System.out.println("\n=== Final Account Info ===");
        sa.displayAccountInfo();
        ca.displayAccountInfo();

        // Total accounts
        System.out.println("\nTotal Accounts Created: " + Bank.getTotalAccounts());
    }
}

