public class Question6 {

    public static class Calculator{

        Calculator(){}//constructor

        private int callCount = 0;//private variable

        //1st method
        public int add(int a, int b){
            return a+b;
        }

        //2nd method
        public int multiply(int a, int b){
           callCount++;
           return(a*b);
        }

        //last method
        public int getCallCount(){
            return callCount;
        }
    }

    public static void main(String[] Args){
        Calculator calc = new Calculator();

        //testing the first method
        System.out.println(calc.add(3, 5));

        //testing the second method
        System.out.println(calc.multiply(3, 5));
        System.out.println(calc.multiply(4, 5));
        System.out.println(calc.multiply(5, 5));
        
        //seeing if the private variable got incremented
        System.out.println(calc.getCallCount());
        
    }
}
