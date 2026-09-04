package lab2.src;

import java.io.*;
import java.util.*;

public class Question7 {
    
    public static void main(String[] args) throws Exception {
        //define the file reader
        Scanner console = new Scanner(new FileReader("lab2/src/given/numbers.txt"));
        
        //define the file writer
        PrintWriter pw = new PrintWriter(new FileWriter("lab2/src/stats.txt"));
        
        // Ensure file is not empty before processing
        if (console.hasNextInt()) {
            //read the first number
            int firstNumber = console.nextInt();
            
            //assign the first number to smallest
            int smallest = firstNumber;

            //assign the first number to largest
            int largest = firstNumber;

            int sum = firstNumber; // Include the first number in the sum

            //if there are more lines to be read
            while (console.hasNextInt()) {
                //read the next number
                int number = console.nextInt();
                
                //add it to the sum
                sum += number;

                if (number < smallest) {
                    //update smallest if the current number is smaller
                    smallest = number;  
                } else if (number > largest) {
                    //update largest if the current number is larger
                    largest = number;
                }
            }

            // Calculate exact average 
            float average = (float) sum / 1000; //We know there are 1000 numbers

            // Write results to the file
            pw.println("Smallest: " + smallest);
            pw.println("Largest: " + largest);
            pw.println("Average: " + average);
        }

        // Close the file writer and scanner
        pw.close();
        console.close();
    }
}