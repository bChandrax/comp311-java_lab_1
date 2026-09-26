import java.io.*;

public class Question2 {
    
    public static void main(String[] args) {

        // Create output.txt using PrintWriter
        try (PrintWriter writer = new PrintWriter("output.txt")) {
            
            // Write five lines of text to the file
            writer.println("Line 1: Java file I/O is straightforward.");
            writer.println("Line 2: PrintWriter simplifies writing text.");
            writer.println("Line 3: Always manage open file resources.");
            writer.println("Line 4: Try-with-resources closes files automatically.");
            writer.println("Line 5: Writing process completed.");
        } catch (FileNotFoundException e) {
            System.out.println("Error creating output.txt: " + e.getMessage());
        }
    }
}