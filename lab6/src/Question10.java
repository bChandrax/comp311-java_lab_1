import java.util.*;

public class Question10 {

    //class as asked
    public static class Rectangle {
        
        //calculate area and return it
        public static double area(double length, double width) {
            return length * width;
        }

        //calculate perimeter and return it
        public static double perimeter(double length, double width) {
            return 2 * (length + width);
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //prompt the user for entries
        System.out.print("Enter a length and a width : ");
        double length = console.nextDouble();
        double width = console.nextDouble();

        //call methods and print them
        System.out.println("AREA : " + Rectangle.area(length, width));
        System.out.println("PERIMETER : " + Rectangle.perimeter(length, width));

        console.close();
    }
}