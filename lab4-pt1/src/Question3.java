import java.io.*;

public class Question3 {

    public static void main(String[] Args) throws Exception {
        //declarations
        PrintWriter fr = new PrintWriter(new FileWriter("Qthree.txt"));
        int sum = 0;
        int[] nums = {2, 34, 54, 6, 100, -5, 78};//initialising the array

        //assining the first value of the array to both largest and smallest 
        int largest = nums[0];
        int smallest = nums[0];

        //since i know how many values i used, i use a forloop
        for (int i = 0; i < 7; i++) {

            //if the value at the current idex of nums is smaller than the value in smallest
            if (nums[i] < smallest) {
                //smallest takes that value
                smallest = nums[i];
            } else if (nums[i] > largest) {//if the value at the current idex of nums is bigger than the value in smallest
                //largest takes that value    
                largest = nums[i];
            }
            //add the current index to sum
            sum += nums[i];
        }

            //writing the results to the file
            fr.println("Smallest : " + smallest);
            fr.println("Largest : " + largest);
            fr.println("Sum : " + sum);

            fr.close();
    }
}