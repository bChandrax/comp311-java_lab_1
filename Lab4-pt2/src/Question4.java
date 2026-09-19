import java.util.*;

public class Question4 {
    public static void main(String[] Args)throws Exception{
        //this is the unsorted array
        int[] scores = {45, 100, 56, 78, 90, 43, 12, 56, 90, 91, 100, 3};
    
        //this will be important in the bubble sort loops
        int numberOfScores = scores.length;

        //this will aid in swapping
        int temporarySwapper;

        //bubble sort algorithm
        for (int i = 0; i<(numberOfScores-1); i++){

            //j starts from i since items before i are already in order
            for (int j = i; j<(numberOfScores-1); j++){

                //if the value in index i is smaller than the one in index j then swap them
                if (scores[i]<scores[j]){

                    //keep the value at index i elsewhere
                    temporarySwapper = scores[i];

                    //index i takes the value at index j
                    scores[i]=scores[j];

                    //index j takes the value we stored away earlier
                    scores[j]=temporarySwapper;
                }
            }
        }

        //print out the array
        System.out.println(Arrays.toString(scores));
    }
}
