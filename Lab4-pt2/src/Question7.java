//import the scanner
import java.util.*;

public class Question7 {
    public static void main(String[] Args){
        //an array with values that repeat as per the question
        int[] classExamScores = {45, 100, 56, 78, 90, 43, 12, 56, 90, 91, 100, 3};

        //declare the scanner
        Scanner console = new Scanner (System.in);

        //prompt the user for an input
        System.out.print("Enter a number to look for : ");
        int answer = console.nextInt();

        //declare the counter
        int count = 0;

        //looping through all the scores
        for(int score: classExamScores){

            //if the user's input is found then increment count
            if (score==answer){
                count++;
            }
        }

        //concact and print
        System.out.println("\nThe number " + answer + " appeared " + count + " times\n");
        console.close();
    }
}
