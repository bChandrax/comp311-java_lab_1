public class Question5 {

    //1st overload
    static void displayInfo(String name){
        System.out.println("Hi, " + name);
    }

    //2nd overload
    static void displayInfo(String name, int age){
        System.out.println("Hi, " + name + " , congrats on making it to " + age + "years old");
    }

    public static void main(){
        displayInfo("Karabo");//call the first overload
        displayInfo("Karabo", 21);//call the second overload
    }
}

