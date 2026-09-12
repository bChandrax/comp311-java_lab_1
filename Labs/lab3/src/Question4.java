import java.util.*;

public class Question4 {

    public static void main(String[] Args){
        int answer = -1;
        Scanner console = new Scanner (System.in);

        do{
            System.out.println("========================= M E N U ==========================");
            System.out.println("1. Continue");
            System.out.println("2. Exit");
            System.out.print("Enter the corresponding number : ");
            answer = console.nextInt();
            if ((answer!=1)&(answer!=2)){
                System.out.println("HEY! Do what I'm telling you!");
            }
        } while(answer!=2);
        console.close();
    }
}
