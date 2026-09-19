public class Question2 {
    public static void main(String[] Args)throws Exception{
        //initialising array
        String[] names = {"Karabo Machanja","John Cena", "Dean Ambrose", "Shea Lacy ", "Bruno Fernandes"};

        //since we know there are exactly 5 names we use a for loop
        for (int i=0; i<5; i++){

            //concact the index number and name then print it
            System.out.println("index " + i + " : " + names[i]);
        }
    }
}
