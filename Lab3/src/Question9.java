import java.util.*;

public class Question9 {
    public static void main(String[] Args){
        //declarations
        Scanner console = new Scanner(System.in);
        int answer;
        int fact = 1;

        //prompt the user
        System.out.print("Enter a whole number : ");
        answer = console.nextInt();

        //loop from 1 to the target number
        for (int i = 1; i<=answer; i++){
            
            //on the last iteration
            if(i==answer){
                //print the current number and an equals sign
                System.out.print(i + " = ");

            }else{
                //print the current number and an asterisc
                System.out.print(i + "*");
            
            }
            fact*=i;
        }
        
        System.out.print(fact + "\n");
        console.close();
    }
}
