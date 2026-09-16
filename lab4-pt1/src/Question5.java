import java.util.*;

public class Question5 {
    
    public static void main()throws Exception{
        //declarations
        String answer = "";
        Scanner console = new Scanner(System.in);

        //prompt the user for an input
        System.out.print("Enter a palindrome : ");
        answer = console.nextLine();

        //reverse the string
        String reversed = new StringBuilder(answer).reverse().toString();

        if(answer.equals(reversed)){//compare the 2 strings
            System.out.println("This is a palindrome");//if the same
        }else{
            System.out.println("Not a palindrome");//if not the same
        }
    }
}
