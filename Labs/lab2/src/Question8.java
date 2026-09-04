package lab2.src;

import java.io.*;
import java.util.*;

public class Question8 {
    public static void main(String[] Args)throws Exception{

        //define a file reader
        Scanner console = new Scanner(new FileReader("lab2/src/given/numbers.txt"));
        
        //define a file reader
        PrintWriter pw = new PrintWriter(new FileWriter("lab2/src/evenodd.txt"));
        
        //define variables to count even and odd numbers
        int countEven = 0;
        int countOdd = 0;
        int num;

        //while there are still numbers to read
        while(console.hasNextInt()){

            //read the next number
            num = console.nextInt();

            //check if the number is even or odd and increment the appropriate counter
            if(num%2==0){
                countEven++;
            }else{
                countOdd++;
            }
        }

        //write the counts to the file
        pw.println("Number of Even numbers: " + countEven);
        pw.println("Number of odd numbers: " + countOdd);
        
        //close the file writer and scanner
        pw.close();
        console.close();
    }
}
