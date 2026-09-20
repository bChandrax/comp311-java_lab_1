import java.util.*;

public class Library {
    //as instructed
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(Book b) {
        books.add(b);
    }

    // Method to print details of all books
    public void printAllBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is currently empty.");
            return;
        }

        System.out.println("\n--- Library Collection ---\n");
        for (Book b : books) {
            // Uses getter methods from your encapsulated Book class
            System.out.println("Title: " + b.title + " | Author: " + b.author + " | Price: $" + b.price);
        }
    }
}