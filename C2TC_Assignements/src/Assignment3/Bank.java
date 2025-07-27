package Assignment3;

// Static part: shared account count
public class Bank {
    private static int totalAccounts = 0;

    // Static method to get total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Static method to increment total accounts
    public static void incrementAccountCount() {
        totalAccounts++;
    }
}

