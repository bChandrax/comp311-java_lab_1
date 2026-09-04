package lab2.src;
import java.io.PrintWriter;
import java.util.*;

public class Question4 {
    
    public  static void main(String[] Args) throws Exception{
        //declarations
        Scanner console = new Scanner (System.in);
        PrintWriter pw = new PrintWriter ("lab2/src/results.txt");
        String name;
        int mark;

        //loop to get 5 students names and marks
        for (int i=0;i<=4;i++){
            //prompt for name
            System.out.print("Enter a Student name : ");
            name = console.next();

            //prompt for mark
            System.out.print("What was their mark : ");
            mark = console.nextInt();

            //write to the file
            pw.println(name + "," + mark);
        }
        console.close();
        pw.close();
    }
}
