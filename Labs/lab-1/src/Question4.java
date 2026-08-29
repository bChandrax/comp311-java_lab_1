import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        //prompt the user for a whole number
        System.out.print("Enter a whole number: ");
        int number = input.nextInt();

        //prompt the user for a decimal number
        System.out.print("Enter a decimal number: ");
        double dec =  input.nextDouble();

        //prompt the user for a word
        System.out.print("Enter a single word: ");
        String word = input.next();

        //concactinate and print
        System.out.println("You entered "+ number + ", " + dec +" and the word "+ "\"" +word+ "\"");
    }
}5