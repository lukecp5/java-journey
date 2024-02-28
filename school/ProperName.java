package school;
import java.util.Scanner;

public class ProperName {
    public static void main(String[] args) {
        // Initialize scanner and get full name from user
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a proper name : ");
        String name = in.nextLine();

        // Initial variables to hold all of the required values
        String firstName;
        String middleName;
        String lastName;
        char firstInitial;
        char middleInitial;
        String lastFirst;
        String shortForm;

        // Get the location of the spaces and first, middle, and last
        int firstSpace = name.indexOf(' ');
        firstName = name.substring(0, firstSpace);

        int secondSpace = name.indexOf(' ', firstSpace + 1);
        middleName = name.substring(firstSpace + 1, secondSpace);

        int thirdSpace = name.indexOf(' ', secondSpace + 1);
        lastName = name.substring(secondSpace + 1, name.length());

        // Use the spaces to get initials
        firstInitial = name.charAt(0);
        middleInitial = name.charAt(firstSpace + 1);

        // String concatenations to create special forms
        lastFirst = lastName + ", " + firstName + " " + middleName;
        shortForm = firstInitial + ". " + middleInitial + ". " + lastName;

        // Output formatted information
        /*
         * EXAMPLE:
         * Enter a proper name : Alan Mathison Turing
         * 
         * Total characters : 18
         * First name : Alan
         * Middle name : Mathison
         * Last name : Turing
         * First initial : A
         * Middle initial : M
         * Last name first : Turing, Alan Mathison
         * Short form : A. M. Turing
         */

        System.out.printf("Total characters     : %d\n", name.length());
        System.out.printf("First name           : %s\n", firstName);
        System.out.printf("Middle name          : %s\n", middleName);
        System.out.printf("Last name            : %s\n", lastName);
        System.out.printf("First initial        : %c\n", firstInitial);
        System.out.printf("Middle initial       : %c\n", middleInitial);
        System.out.printf("Last name first      : %s, %s %s\n", lastName, firstName, middleName);
        System.out.printf("Short form           : %s\n", shortForm);


        // System.out.printf("f: %s m: %s l: %s \n First: %c Middle: %-10c\n %s\n %-15s", firstName, middleName, lastName,
        //         firstInitial, middleInitial, lastFirst, shortForm);

    }
}
