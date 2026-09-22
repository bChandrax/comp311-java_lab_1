public class Question2 {

    //method as requested
    static double circleArea(double radius){
        double answer = Math.pow(radius,2) * 3.14;
        return answer;
    }

    public static void main(){
        //collection of radi of different circles
        double[] rad = {100, 12, 8,18, 96};

        //per radius calculate the area of that circle
        for(double value : rad){
            System.out.println("The area of a circle with radius " + value +  "m is " + circleArea(value) + "m^2");;
        }
    }
}



