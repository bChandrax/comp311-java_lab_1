import java.util.*;

public class Question10 {
    public static void main(String[] Args){
        //given from question
        int[] numbers = {10, 20, 30, 40, 50};

        //expanding the array to a size of 6
        numbers = Arrays.copyOf(numbers, 6);

        //assigning a value to the 6th index
        numbers[5] = 60;

        //print it just to make sure
        System.out.println("\n"+ Arrays.toString(numbers) +"\n");
    }
}
