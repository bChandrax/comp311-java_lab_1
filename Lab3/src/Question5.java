import java.util.*;

public class Question5 {
    public static void main(String[] Args){
        //declarations
        Scanner console = new Scanner (System.in);
        int answer;

        //execute atleast once
        do{
            //prompt the user for an entry
            System.out.print("enter a number between (1-10) : ");
            answer = console.nextInt();

            //loop whilst entry is out of range
        }while((answer<1)||(answer>10));
        console.close();
    }
}
