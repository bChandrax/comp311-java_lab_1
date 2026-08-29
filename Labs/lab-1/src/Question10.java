import java.util.Scanner;

public class Question10 {
    
    public static void main(String[] Args){
        Scanner input = new Scanner (System.in);

        //prompting the user for their full name
        System.out.print("Enter your full name: ");
        String name = input.nextLine();

        //finding the position of the space
        int positionOfSpace = name.indexOf(" ");

        //breaking apart the first and last names
        String firstName = name.substring(0,positionOfSpace);
        String lastName = name.substring(positionOfSpace+1,name.length());

        //print the first and last name
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);

        //breaking the first letter of each name and concactinating the initials
        String initials = firstName.substring(0,1)+"."+ lastName.substring(0,1);

        //printing the initials
        System.out.println("Initials: " + initials);
    }
}
