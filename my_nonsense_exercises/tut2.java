package my_nonsense_exercises;
import java.util.*;

public class tut2 {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String entry = console.nextLine();

        StringTokenizer st = new StringTokenizer(entry);

        ArrayList <String> words = new ArrayList<>();
        
        while(st.hasMoreTokens()){
            words.add(st.nextToken());
        }

        System.out.println(words);

        console.close();
    }
}
