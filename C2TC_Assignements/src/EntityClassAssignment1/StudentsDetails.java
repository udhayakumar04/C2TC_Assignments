package EntityClassAssignment1;
import java.util.Scanner;
public class StudentsDetails {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Student[] students = new Student[3];

	    // Collect details for 3 students
	    for (int i = 0; i < 3; i++) {
	        System.out.println("Enter details for student " + (i + 1) + ":");
	        System.out.print("Name: ");
	        String name = sc.nextLine();
	        System.out.print("Age: ");
	        int age = sc.nextInt();
	        System.out.print("Roll Number: ");
	        int rollNumber = sc.nextInt();
	        sc.nextLine();  // Consume leftover newline

	        students[i] = new Student(name, age, rollNumber);
	    }

	    // Display details of all students
	    System.out.println("\nStudent Details:");
	    for (Student s : students) {
	        s.display();
	    }

	    sc.close();
	}
	}

