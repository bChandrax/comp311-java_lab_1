import java.util.Scanner;

public class Question9 {
    public static void main(String[] Args){
        Scanner input = new Scanner (System.in);

        //prompting the user for a sentence
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        //concactinate and print
        System.out.println("Length: " + sentence.length());
        System.out.println("Upper Case: " + sentence.toUpperCase());
        System.out.println("Lower case: " + sentence.toLowerCase());
    }
}
