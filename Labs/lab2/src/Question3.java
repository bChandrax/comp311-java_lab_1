package lab2.src;

import java.io.*;
import java.util.Scanner;


public class Question3 {
    
    public static void main(String[] Args) throws Exception{
        Scanner console = new Scanner(new FileReader("lab2/src/students.txt"));

        //while there is still a line  to read
        
        while (console.hasNext()){
            //read the line from txt
            String line = console.nextLine();

            //find the position of the comma
            int positionOfComma = line.indexOf(",");

            //make a string of the characters before the comma(the name)
            String name = line.substring(0, positionOfComma);

            //make a string of the characters after the comma(the mark)
            String mark = line.substring((positionOfComma+1), (line.length()) );

            //concact and print to the screen
            System.out.println("Name: " + name + " || " + "Mark: " + mark);
        }

        console.close();
    }

}
