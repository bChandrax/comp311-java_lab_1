package lab2.src;

import java.io.*;
import java.util.*;

public class Question10 {
    
    public static void main(String[] Args)throws Exception{

        //define a file reader
        Scanner fileConsole = new Scanner (new FileReader("lab2/src/given/numbers.txt"));
        
        //define a user input scanner
        Scanner userConsole = new Scanner (System.in);
        
        //prompt the user for a number
        System.out.print("Print a number to search for in the file: ");
        int num = userConsole.nextInt();

        //infinite loop
        while(true){
            //check if the number in the file matches the user input
            if(fileConsole.nextInt() == num){
                System.out.println("True");
                break;
            }

            //check if there are no more numbers in the file
            if(fileConsole.hasNextInt() == false){
                System.out.println("False");
                break;
            }
        }
        fileConsole.close();
        userConsole.close();
    }
}
