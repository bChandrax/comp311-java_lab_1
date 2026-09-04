package lab2.src;

import java.io.*;
import java.util.*;

public class Question9 {
    
    public static void main(String[] Args)throws Exception{
        //define a file reader
        Scanner console = new Scanner (new FileReader("lab2/src/given/numbers.txt"));
        
        //define a file writer
        PrintWriter pw = new PrintWriter(new FileWriter("lab2/src/signs.txt"));

        //define counters and temporary variable
        int num;
        int countPositive = 0;
        int countNegative = 0;
        
        //while there are still numbers to read
        while (console.hasNextInt()){

            //read the next number
            num = console.nextInt();

            if(num<0){
                //if number is negative increment the negative counter
                countNegative++;
            }else if (num>0){
                //if number is positive increment the positive counter
                countPositive++;
            }
        }

        //write the counts to the file
        pw.println("Number of Positive numbers: " + countPositive);
        pw.println("Number of Negative numbers: " + countNegative);

        //close the file writer and scanner
        pw.close();
        console.close();
    }
}
