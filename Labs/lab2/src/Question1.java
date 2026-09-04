package lab2.src;

import java.util.Scanner;

public class Question1 {
    
    public static void main(String[] Args){
        Scanner console = new Scanner(System.in);

        //prompt user
        System.out.print("enter a numeric score between 0 and 100 : ");
        int mark = console.nextInt();

        //check invalid
        if ((mark<0)||(mark>100)){
            System.out.println("Hey! Follow the rules!");
        } else if(mark<50){
            //if less than 50
            System.out.println("F");
        } else if(mark<60){
            //if less than 60
            System.out.println("D");
        } else if(mark<70){
            //if less than 70
            System.out.println("C");
        } else if(mark<80){
            //if less than 80
            System.out.println("B");
        } else{
            //if 80 or above
            System.out.println("A");
        }
        console.close();
    }
}
