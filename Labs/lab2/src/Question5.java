package lab2.src;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

public class Question5 {

    public static void main(String[] Args) throws Exception{
        
        //declarations
        Scanner console = new Scanner(new FileReader ("lab2/src/students.txt"));
        PrintWriter pw = new PrintWriter ("lab2/src/grades.txt");
        String line, preScore, grade, name;
        int positionOfComma;
        
        //while there is still a line to read
        while(console.hasNext()){

            //read the line from txt
            line = console.nextLine();

            //find the position of the comma
            positionOfComma = line.indexOf(",");

            //make a string of the characters before the comma(the name)
            name = line.substring(0,positionOfComma);

            //make a string of the characters after the comma(the score(pre-parsed))
            preScore = line.substring( (positionOfComma+1), (line.length()) );
            
            //convert the preparsed score to an integer
            int score = Integer.parseInt(preScore);

            //determine the grade based on the score
            if (score >= 90){
                //if the score is 90 or above
                grade = "A";
            } else if (score >= 80){
                //if the score is 80 or above
                grade = "B";
            } else if (score >= 70){
                //if the score is 70 or above
                grade = "C";
            } else if (score >= 60){
                //if the score is 60 or above
                grade = "D";
            } else {
                //if the score is below 60
                grade = "F";
            }

            //concact and write to the file
            pw.println(name + "," + preScore + "," + grade);
        }
        console.close();
        pw.close();
    }
}
