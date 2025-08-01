package Assignment4;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter :  1 for AirIndia, 2 for KingFisher, 3 for Indigo:");
        int choice = Integer.parseInt(sc.nextLine());

        System.out.println("Enter number of hours:");
        int hours = Integer.parseInt(sc.nextLine());

        Airfare airfare = null;

        switch (choice) {
            case 1:
                airfare = new AirIndia(hours);
                break;
            case 2:
                airfare = new KingFisher(hours);
                break;
            case 3:
                airfare = new Indigo(hours);
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        double amount = airfare.calculateAmount();
        System.out.printf("Total amount: %.2f\n", amount);

        sc.close();
    }
}
