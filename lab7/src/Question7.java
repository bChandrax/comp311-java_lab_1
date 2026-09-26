import java.io.*;

public class Question7 {
    public static void main(String[] args) {

        // Passing 'true' to FileWriter constructor enables append mode
        try (FileWriter fw = new FileWriter("output.txt", true);
            //declare the file writer 
             PrintWriter writer = new PrintWriter(fw)) {

            // Append two new lines without overwriting existing contents
            writer.println("Line 6: Appended line one.");
            writer.println("Line 7: Appended line two.");
            
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }
}