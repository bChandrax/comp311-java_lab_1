public class Question7 {

    //Dobling method as requested
    static int tryToDouble(int number){
        number = number *2;
        return number;
    }

    public static void main(String[] args) {
        //variable to double
        int number = 45;

        //print the doubled answer after passing by value
        System.out.println("\n" + tryToDouble(number));

        //print the number before being passed by value
        System.out.println(number);
    }

    
}
