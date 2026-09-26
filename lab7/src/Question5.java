import java.io.*;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        //declarations
        File file = new File("story.txt");
        int wordCount = 0;

        //create the file reader
        try (Scanner scanner = new Scanner(file)) {

            // hasNext() reads word-by-word (whitespace delimited)
            while (scanner.hasNext()) {
                scanner.next();
                wordCount++;
            }

            // print out the word count
            System.out.println("Word count: " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: story.txt not found.");
        }
    }
}