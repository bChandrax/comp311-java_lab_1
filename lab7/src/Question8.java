import java.io.*;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        //declarations
        File file = new File("numbers.txt");
        int sum = 0;

        //declare the file reader
        try (Scanner scanner = new Scanner(file)) {

            // Read the numbers and calculate total
            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            }

            //print the final answer
            System.out.println("Total sum: " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("Error: numbers.txt not found.");
        }
    }
}