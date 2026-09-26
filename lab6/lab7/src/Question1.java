import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Create a File object referencing story.txt
        File file = new File("story.txt");

        // Use try-with-resources to automatically close the Scanner
        try (Scanner scanner = new Scanner(file)) {
            //for formatting reasons
            System.out.println("\n");

            // Read and print each line until the end of the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: story.txt not found.");
        }
    }
}