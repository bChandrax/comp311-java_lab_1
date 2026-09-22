public class Question4{

    //1st method overload
    static int combine(int num1, int num2){
        return num1 + num2;
    }

    //2nd method overload
    static String combine(String sen1, String sen2){
        String answer = sen1 + sen2;
        return answer;
    }

    //3rd method overload
    static double combine(double num1, double num2){
        return num1 + num2;
    }

    public static void main(String[] Args){ 
        System.out.println(combine(3, 2));//1st method call
        System.out.println(combine("3", "2"));//2nd method call
        System.out.println(combine(3.0, 2.0));//3rd method call
    }
}