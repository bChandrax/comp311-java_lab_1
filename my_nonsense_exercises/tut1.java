package my_nonsense_exercises;
import java.util.*;

public class tut1 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Jayden is stupid");
        while(st.hasMoreTokens()){
            System.out.print(st.nextToken(" "));
        }
    }    
}