import java.io.*;
import java.util.*;

public class Question1{

    public static void main(String[] Args) throws Exception{

        //declarations
        FileReader fr = new FileReader("names.txt");
        Scanner console = new Scanner(fr);
        String[] names = new String[20];

        //reading with a for loop wince we know there are exactly 20 names
        for (int i=0;i<20;i++){
            //reading from the file
            names[i]=console.nextLine();
        }

        //output the array to make sure we read all 20 names
        for (int j=0;j<20;j++){
            System.out.println(names[j]);
        }

        console.close();
    }


}