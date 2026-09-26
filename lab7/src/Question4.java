import java.io.*;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        //declarations
        File file = new File("story.txt");
        int lineCount = 0;

        //create the file reader
        try (Scanner scanner = new Scanner(file)) {

            // Increment counter for every line read
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lineCount++;
            }

            //print results after completion
            System.out.println("\nLine count: " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: story.txt not found.");
        }
    }
}