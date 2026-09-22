public class Question1{

    //methid as requested
    static boolean isEven(int entry){
        if (entry%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(){

        //array of integers
        int[] arr = {0,41,50,9};

        //loop through the array and check if they are even then print
        for (int num : arr){
            System.out.println(num +  " is " + isEven(num));
        }
    }
}