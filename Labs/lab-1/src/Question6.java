import java.util.Scanner;

public class Question6 {

    public static void main(String[] Args){
        Scanner input = new Scanner (System.in);

        //prompting user for 3 scores
        System.out.print("Enter three scores: ");
        double scoreOne = input.nextDouble();
        double scoreTwo = input.nextDouble();
        double scoreThree = input.nextDouble();

        //caclculating average
        double Average = (scoreOne + scoreTwo + scoreThree)/3;

        //concactinate and print
        System.out.println("Average: " + Average);
    }

}
