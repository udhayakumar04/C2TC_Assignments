package Assignment2;

public class Main {
	 public static void main(String[] args) {
	        // Create Student object
	        Student s = new Student();

	        // Create Commission object using constructor
	        Commission emp = new Commission("udhaya", "cuddalore", "9868389856", 60000);

	        System.out.println("Name: " + emp.getName());
	        System.out.println("Address: " + emp.getAddress());
	        System.out.println("Phone: " + emp.getPhone());
	        System.out.println("Sales Amount: ₹" + emp.getSalesAmount());

	        emp.setSalesAmount(85000);
	        System.out.println("Updated Sales Amount: ₹" + emp.getSalesAmount());
}
}
