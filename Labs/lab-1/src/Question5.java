import java.util.Scanner;

public class Question5 {

    public static void main(String[] Args){

        Scanner input = new Scanner (System.in);

        //prompt the user for a number
        System.out.print("Enter first number: ");
        float firstNumber = input.nextInt();

        //prompt the user for another number
        System.out.print("Enter second number: ");
        float secondNumber = input.nextInt();

        //concactinate and print
        System.out.println("Sum : "+ (firstNumber + secondNumber) );
        System.out.println("Difference: " + (firstNumber-secondNumber));
        System.out.println("Product: " + (firstNumber*secondNumber));
        System.out.println("Quotient: " + (firstNumber/secondNumber));
        System.out.println("Reminder: " + (firstNumber%secondNumber));
    }
}
