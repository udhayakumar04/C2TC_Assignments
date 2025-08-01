package Assignment5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for booking details
        System.out.println("Enter booking details in CSV format (StageEvent,Customer,NoOfSeats):");
        String bookingInput = sc.nextLine();
        String[] input = bookingInput.split(",");
        String stageEvent = input[0];
        String customer = input[1];
        int noOfSeats = Integer.parseInt(input[2]);

        // Create object
        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        // Prompt for payment mode
        System.out.println("Select Payment Mode:");
        System.out.println("1. Cash");
        System.out.println("2. Wallet");
        System.out.println("3. Credit Card");
        System.out.print("Enter your choice: ");
        int paymentMode = Integer.parseInt(sc.nextLine());

        // Echo booking input
        System.out.println("\n--- INPUT ---");
        System.out.println(bookingInput);
        System.out.println(paymentMode);

        // Common Output
        System.out.println("\n--- OUTPUT ---");
        System.out.println("Stage event:" + booking.getStageEvent());
        System.out.println("Customer:" + booking.getCustomer());
        System.out.println("Number of seats:" + booking.getNoOfSeats());

        // Switch case with detailed prompts and input echo
        switch (paymentMode) {
            case 1: {
                System.out.print("Enter amount to be paid (Cash): ");
                double amount = Double.parseDouble(sc.nextLine());
                System.out.println(amount);
                booking.makePayment(amount);
                break;
            }
            case 2: {
                System.out.print("Enter amount to be paid (Wallet): ");
                double amount = Double.parseDouble(sc.nextLine());
                System.out.print("Enter wallet number: ");
                String walletNumber = sc.nextLine();
                System.out.println(amount);
                System.out.println(walletNumber);
                booking.makePayment(amount, walletNumber);
                break;
            }
            case 3: {
                System.out.print("Enter card holder name: ");
                String cardHolderName = sc.nextLine();
                System.out.print("Enter amount to be paid (Credit Card): ");
                double amount = Double.parseDouble(sc.nextLine());
                System.out.print("Enter credit card type: ");
                String cardType = sc.nextLine();
                System.out.print("Enter CCV number: ");
                String ccv = sc.nextLine();
                System.out.println(cardHolderName);
                System.out.println(amount);
                System.out.println(cardType);
                System.out.println(ccv);
                booking.makePayment(cardHolderName, amount, cardType, ccv);
                break;
            }
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
