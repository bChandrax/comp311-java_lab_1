import java.util.Scanner;

public class Question7 {
    
    public static void main(String[] Args){
        Scanner input = new Scanner (System.in);

        //prompt user for input in degrees celcius
        System.out.print("Ener the temperature in degrees Celcius: ");
        double deg = input.nextDouble();

        //calculate the degrees farenheight
        double answer = deg * (9.0/5) + 32;

        //printing the answer
        System.out.println(deg + " degress celicus is " + answer + " degrees Farenheight.");

    }

}
