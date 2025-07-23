package EntityClassAssignment1;

public class Student {

		String name;
	    int age;
	    int rollNumber;

	    // Constructor to initialize student details
	    public Student(String name, int age, int rollNumber) {
	        this.name = name;
	        this.age = age;
	        this.rollNumber = rollNumber;
	    }

	    // Method to display student details
	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("----------------------");
	    }
	}

