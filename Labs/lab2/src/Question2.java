package lab2.src;

import java.util.Scanner;

public class Question2 {

    public static void main (String[] Args){
        Scanner console = new Scanner (System.in);
        
        //prompt the user
        System.out.print("Enter your name : ");
        String name = console.next();

        //display the name in different formats
        System.out.println("Number of characters : " + name.length());
        System.out.println("Upper Case : " + name.toUpperCase());
        System.out.println("Lower Case : " + name.toLowerCase());
        console.close();
    }
}