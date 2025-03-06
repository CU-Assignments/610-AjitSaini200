import java.util.Scanner;

// Base class
class Book {
    protected String title;
    protected String author;
    protected double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// Derived class for Fiction books
class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("Fiction Book Details:");
        super.displayDetails();
    }
}

// Derived class for Non-Fiction books
class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("Non-Fiction Book Details:");
        super.displayDetails();
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Fiction book
        System.out.println("Book 1:");
        System.out.print("Type: Fiction\nTitle: ");
        String fictionTitle = scanner.nextLine();
        System.out.print("Author: ");
        String fictionAuthor = scanner.nextLine();
        System.out.print("Price: ");
        double fictionPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over

        // Create Fiction book object
        Fiction fictionBook = new Fiction(fictionTitle, fictionAuthor, fictionPrice);

        // Input for Non-Fiction book
        System.out.println("\nBook 2:");
        System.out.print("Type: Non-Fiction\nTitle: ");
        String nonFictionTitle = scanner.nextLine();
        System.out.print("Author: ");
        String nonFictionAuthor = scanner.nextLine();
        System.out.print("Price: ");
        double nonFictionPrice = scanner.nextDouble();

        // Create Non-Fiction book object
        NonFiction nonFictionBook = new NonFiction(nonFictionTitle, nonFictionAuthor, nonFictionPrice);

        // Display book details
        fictionBook.displayDetails();
        System.out.println(); // Print a blank line for better readability
        nonFictionBook.displayDetails();

        // Close the scanner
        scanner.close();
    }
}
