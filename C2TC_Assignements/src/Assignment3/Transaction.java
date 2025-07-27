package Assignment3;

// Final part: final method and variable
public class Transaction {
    // final variable: fixed fee
    private final double transactionFee = 5.0;

    // final method: cannot be overridden
    public final void performTransaction(Account account, String type, double amount) {
        System.out.println("\nTransaction Type: " + type);
        System.out.println("Transaction Fee: ₹" + transactionFee);

        switch (type.toLowerCase()) {
            case "deposit":
                account.deposit(amount - transactionFee);
                break;
            case "withdraw":
                account.withdraw(amount + transactionFee);
                break;
            default:
                System.out.println("Invalid transaction type.");
        }

        System.out.println("Post-transaction Balance: ₹" + account.getBalance());
    }

    public double getTransactionFee() {
        return transactionFee;
    }
}
