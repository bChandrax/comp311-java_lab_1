public class Question9 {

    public static class Human{
        
        //Constructor
        Human(){}

        //greeting method
        public void greeting(String name){
            System.out.println("Hi, " + name);
        }

        //overloaded greeting function
        public void greeting(String name, String gender){
            if (gender=="Male"){
                System.out.println("Hi, Mr." + name);
            } else{
                System.out.println("Hi, Mrs." + name);
            }
        }
    }

    //Subclass Boy
    public static class Boy extends Human{

        //overidden greeting function
        public void greeting(String name){
            System.out.println("Hey my man " + name + ". *Daps you up*");
        }
    }

    public static void main(String[] args) {

        //declarations
        Human Me = new Human();
        Boy Him = new Boy();

        //function calls
        Me.greeting("Karabo");
        Me.greeting("Karabo", "Male");
        Me.greeting("Karabo", "FeMale");
        Him.greeting("Karabo");
    }
}
