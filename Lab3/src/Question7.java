import java.util.*;

public class Question7 {
    public static void main(String[] Args){
        //declarations
        Scanner console = new Scanner(System.in);
        int answer, i;

        //prompt the user for a number
        System.out.print("Enter a number, I'll show you the multiplication table : ");
        answer = console.nextInt();

        //loop through the table
        for (i=1; i<=12; i++){
            //print the number
            System.out.print(answer*i);

            if (i!=12){
                //print a comma
                System.out.print(" , ");
            } else{
                //when printing the last number print the next line
                System.out.print("\n");
            }
        }
        console.close();
    }
}
