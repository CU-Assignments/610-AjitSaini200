import java.util.Scanner;

// Abstract class
abstract class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to display details
    public abstract void displayDetails();
}

// Derived class for Student
class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Derived class for Teacher
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

public class StudentInformationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Student
        System.out.println("Add Student:");
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Age: ");
        int studentAge = scanner.nextInt();
        System.out.print("Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        // Create Student object
        Student student = new Student(studentName, studentAge, rollNumber);

        // Input for Teacher
        System.out.println("\nAdd Teacher:");
        System.out.print("Name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Age: ");
        int teacherAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Subject: ");
        String subject = scanner.nextLine();

        // Create Teacher object
        Teacher teacher = new Teacher(teacherName, teacherAge, subject);

        // Display details
        System.out.println();
        student.displayDetails();
        System.out.println(); // Print a blank line for better readability
        teacher.displayDetails();

        // Close the scanner
        scanner.close();
    }
}
