import java.util.*;

public class Question4 {
    
    public static void main(String[] Args)throws Exception{

        //declarations
        Scanner console = new Scanner(System.in);
        String Answer="";

        //promp the user for a number
        System.out.print("Enter a number to convert : ");
        int num = console.nextInt();

        //mathematical operations 
        while(num!=0){
            Answer = Answer + num%2;//concatinates 0 or 1
            num = (int) num/2;//halfs the number and rounds down
        }

        //reverse the string
        Answer = new StringBuilder(Answer).reverse().toString();

        System.out.println("Binary equivalent is "+ Answer);

        console.close();
    }
}
