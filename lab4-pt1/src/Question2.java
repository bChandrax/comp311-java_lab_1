import java.io.*;

public class Question2 {
    public static void main(String[] Args)throws Exception{

        //declaring the file writter to write to two.txt
        PrintWriter pw = new PrintWriter(new FileWriter("two.txt"));

        //declare an array of doubles
        double[] nums = new double[5];

        //loop through the array of doubles
        for(int i=0; i<5;i++){

            //take the current have of i multipky it by a random constant i chose 0.5 and assign it to the current index of nums
            nums[i]=i*0.5;

            //print the freshly assigned index to the file as well
            pw.println(nums[i]);
            
        }

        pw.close();
    }
}
