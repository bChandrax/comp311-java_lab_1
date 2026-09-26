import java.io.*;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // Reference a file that does not exist
        File file = new File("missing.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            // Catch the exception and output a friendly message
            System.out.println("\nNotice: The file 'missing.txt' could not be found.\n");
        }
    }
}