package lab2.src;
import java.util.*;

public class Question6 {
    
    public static void main(String[] Args) throws Exception{
        
        Scanner console = new Scanner(System.in);

        //prompt the user
        System.out.print("Enter a number (1-7): ");
        int day = console.nextInt();

        //determine the day of the week based on the number entered
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
        console.close();
    }
    
}
