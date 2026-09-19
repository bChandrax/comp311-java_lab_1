public class Question8 {
    public static void main(String[] Args){
        //2D array as per the Question's instructinon
        int[][] arrTwoD = {{1,2,3},{4,5,6},{7,8,9}};

        //first extract the rows in the array
        for (int[] row : arrTwoD){

            //then extract the cells from the rows
            for (int cell:row){

                //print each cell in the row
                System.out.print(" "+ cell +" ");
            }

            //when we're done with the current row move to the next line
            System.out.print("\n");
        }
    }
}
