public class Question9 {
    public static void main(String[] Args){
        //array of student test scores
        int[][] studentScores = {{45,80,100},{100,90,20},{50,60,70}};
        
        //declare array for sums per student
        int[] sum = {0,0,0};

        //first get the rows
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                sum[i] += studentScores[i][j];
            }
            System.out.println(" Student " + (i+1) + " sum : " + sum[i]);
        }
    }
}
