import java.util.*;

public class Question6 {
    public static void main(String[] Args){

        //declarations
        int answer = 0;
        int sum = 0;
        Scanner console = new Scanner(System.in);

        //execute atleast once
        do{

            //prompt the user
            System.out.print("Enter a number to add to sum(Enter 0 to stop) : ");
            answer = console.nextInt();

            //add the user's answer to the sum
            sum+=answer;

        }while(answer!=0);//while the entry isn't 0

        //print the sum of everything
        System.out.println("Sum: " + sum);
        console.close();
    }
}
