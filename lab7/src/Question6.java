import java.io.*;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        //declare the file
        File inputFile = new File("story.txt");

        // Open the file reader & file writer
        try (Scanner scanner = new Scanner(inputFile);PrintWriter writer = new PrintWriter("story_copy.txt")) {

            // Read each line from OG and write it to the copy
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                writer.println(line);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}