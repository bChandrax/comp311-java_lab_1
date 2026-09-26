import java.io.*;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        //declare the scanner for user input
        Scanner console = new Scanner(System.in);

        //declare the file writer
        try (PrintWriter writer = new PrintWriter("results.txt")) {
            
            // Loop exactly three times to prompt for student names and scores
            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter name for student " + i + ": ");
                String name = console.nextLine();

                System.out.print("Enter score for student " + i + ": ");
                String score = console.nextLine();

                // Write formatted Name,Score line to results.txt
                writer.println(name + "," + score);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error creating results.txt: " + e.getMessage());
        } finally {
            console.close();
        }
    }
}