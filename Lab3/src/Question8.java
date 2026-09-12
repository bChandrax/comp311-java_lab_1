import java.util.*;

public class Question8 {
    public  static void main(String[] Args){
        //declarations
        Scanner console = new Scanner(System.in);
        String sentence = "";
        char letter;
        int countVowels = 0;

        //prompt the user to enter a sentence
        System.out.print("Enter a sentence : ");
        sentence = console.nextLine().toUpperCase();

        //loop through all characters in the sentence
        for (int i = 0; i<=sentence.length()-1;i++){
            
            //read a character
            letter = sentence.charAt(i);
            
            //if the character is a vowel
            if (
                (letter=='A')||
                (letter=='E')||
                (letter=='I')||
                (letter=='O')||
                (letter=='U')
            ){
                //increment the count
                countVowels++;
            }
        }
        System.out.print("There are " + countVowels + " vowels in your sentence");
        console.close();
    }
}
