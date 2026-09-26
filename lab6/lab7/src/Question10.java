import java.io.*;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

        //declare the file
        File inputFile = new File("results.txt");

        //declare the file reader
        try (Scanner scanner = new Scanner(inputFile);
        //declare the file wruter
             PrintWriter writer = new PrintWriter("passed.txt")) {

            while (scanner.hasNextLine()) {
                
                //read from the file
                String line = scanner.nextLine();

                // Split line by comma into name and score parts
                String[] parts = line.split(",");

                //the first index of the array keeps the name we read so assign it to a variable 'name'
                String name = parts[0];

                //the secon index of the array keeps the score of the person, so parse it and store it in 'score'
                int score = Integer.parseInt(parts[1]);

                // Write to passed.txt only if score is 50 or higher
                if (score >= 50) {
                    writer.println(name + "," + score);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: results.txt not found.");
        }
    }
}