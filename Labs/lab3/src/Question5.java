import java.util.*;

public class Question5 {
    public static void main(String[] Args){
        Scanner console = new Scanner (System.in);
        int answer = -6;
        do{
            System.out.print("enter a number between (1-10) : ");
            answer = console.nextInt();
        }while((answer<1)||(answer>10));
        console.close();
    }
}
