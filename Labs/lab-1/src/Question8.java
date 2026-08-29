import java.util.Scanner;

public class Question8 {
    
    public static void main(String[] Args){
        Scanner input = new Scanner (System.in);

        //prompting for the length of the rectangle
        System.out.print("Enter the length: ");
        float length = input.nextFloat();

        //prompting for the width of the rectangle
        System.out.print("Enter the width: ");
        float width = input.nextFloat();

        //calculating answers
        float area = length*width;
        float perimeter = 2*(length+width);

        //printing answers
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
