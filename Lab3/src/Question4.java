import java.util.*;

public class Question4 {

    public static void main(String[] Args){
        // declarations
        int answer;
        Scanner console = new Scanner (System.in);

        // loop for the menu
        do{

            //the menu
            System.out.println("========================= M E N U ==========================");
            System.out.println("1. Continue");
            System.out.println("2. Exit");
            
            //prompt the user for an input
            System.out.print("Enter the corresponding number : ");
            answer = console.nextInt();

            //incase of invalid input
            if ((answer!=1)&(answer!=2)){
                System.out.println("HEY! Do what I'm telling you!");
            }
        } while(answer!=2);
        console.close();
    }
}
