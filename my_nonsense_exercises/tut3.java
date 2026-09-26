package my_nonsense_exercises;
import java.util.*;

public class tut3 {
    public static void main(String[] args) {
        String entry = "Newcastle United will wi the premier league";
        StringTokenizer st = new StringTokenizer(entry);
        int longest = 0;

        String current;
        while(st.hasMoreTokens()){
            current = st.nextToken();
            if(current.length()>longest){
                longest = current.length();
            }
        }

        System.out.println(longest);
    }
}