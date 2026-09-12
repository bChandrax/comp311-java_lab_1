import java.util.*;

public class Question2 {
    public static void main(String[] Args){
        Scanner console = new Scanner (System.in);
        
        //prompt the user for a number
        System.out.print("Enter a number : ");
        int number = console.nextInt();

        //initialise sum
        int sum = 0;

        //sum up until the target number
        for (int i=0;i<=number; i++){
            sum+=i;
        }
        
        System.out.println("The sum is : " + sum);
        console.close();
    }
}
