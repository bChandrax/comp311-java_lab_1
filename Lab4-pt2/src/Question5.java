//import the scanner
import java.util.*;

public class Question5 {
    public static void main(String[] Args)throws Exception{
        //this is the predefined array as per the question
        int[] scores = {45, 105, 56, 78, 90, 43, 12, 86, 90, 91, 190, 3};

        //this will be important in the search loop
        int numberOfScores = scores.length;
        int index = 0;
    
        //declare the scanner
        Scanner console = new Scanner(System.in);

        //prompt the user for an input
        System.out.print("Enter a number and we will try find it : ");
        int answer = console.nextInt();

        //the loop to find the value
        do{
            //if the value is found then...
            if (scores[index]==answer){
                System.out.println("\nValue found at index " + index + "\n");
                break;
            }

            //once the above condition isn't satisfied and we're at the last index, then the value isn't there
            if (index == (numberOfScores-1)){
                System.out.println("\nValue not found\n");
            }
            index++;
        }
        while(index<=(numberOfScores-1));
        console.close();
    }
}
