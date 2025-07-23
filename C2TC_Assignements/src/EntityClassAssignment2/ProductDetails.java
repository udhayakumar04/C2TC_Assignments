package EntityClassAssignment2;
import java.util.Scanner;
public class ProductDetails {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Product[] products = new Product[4];

	        // Collect details for 4 products
	        for (int i = 0; i < 4; i++) {
	            System.out.println("Enter details for product " + (i + 1) + ":");
	            System.out.print("Product Name: ");
	            String productName = sc.nextLine();
	            System.out.print("Product ID: ");
	            int productId = sc.nextInt();
	            System.out.print("Price: ");
	            double price = sc.nextDouble();
	            sc.nextLine();  // Consume leftover newline

	            products[i] = new Product(productName, productId, price);
	        }

	        // Display details of all products
	        System.out.println("\nProduct Details:");
	        for (Product p : products) {
	            p.display();
	        }

	        sc.close();
	    }
}
