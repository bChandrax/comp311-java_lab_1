public class Question3 {
    public static void main(String[] Args)throws Exception{
        //scores are integers because they are marked out of 100
        int[] classExamScores = {45, 100, 56, 78, 90, 43, 12, 56, 90, 91, 100, 3};
        
        //more declarations
        int sum = 0;    
        double average = 0;

        //enhanced for loop
        for (int score : classExamScores){
            
            //add score to the sum
            sum+=score;
        }

        //calculate average and typecast it to keep the digits after the decimal point
        average = (double) sum/(classExamScores.length);

        //print the final answers
        System.out.println("Sum of scores : " + sum);
        System.out.println("Average of scores : " + average);

    }
}
