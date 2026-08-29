import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        //prompt user for the name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        //prompt user for their age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        //contactinate and print
        System.out.println("Hello " + name + "! In five years you will be " + (age+5) + "years old.");
    }
}
