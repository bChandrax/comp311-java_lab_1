public class Question6 {
    public static void main(String[] Args){

        //declarations
        int[] scores = {45, 100, 56, 78, 90, 43, 12, 56, 90, 91, 100, 3};
        int smallest = scores[0];
        int largest = scores[0];

        //for each score..
        for (int score : scores){

            //if the score is smaller than the smallest then reassign smallest
            if (score<smallest){
                smallest = score;

            //if the score is larger than the largest then reassign the largest
            }else if(score>largest){
                largest = score;
            }
        }

        //print the results
        System.out.println("\nLargest number is : " + largest);
        System.out.println("Smallest number is : " + smallest +"\n");
    }
}
