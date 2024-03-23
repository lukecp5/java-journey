package intermediate;
import java.util.Random;
import java.util.Scanner;

public class passwordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the desired length of the password: ");
        int length = scanner.nextInt();

        System.out.print("Do you want to include symbols? (Y/N): ");
        boolean includeSymbols = scanner.next().equalsIgnoreCase("Y");
        scanner.close();
        String password = generatePassword(length, includeSymbols);
        System.out.println("Generated password: " + password);
    }

    private static String generatePassword(int length, boolean includeSymbols) {
        /// A string of all possible characters that could be included in the password.
        // Contains all uppercase and lowercase letters, and digits from 0 to 9. */
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // NOTE: If 'includeSymbols' flag is true, then special symbol characters are
        // added to the 'characters' string.
        if (includeSymbols) {
            characters += "!@#$%^&*()";
        }

        // A new Random object is created to generate random numbers.
        Random random = new Random();

        // A StringBuilder object is created to build the password string.
        StringBuilder password = new StringBuilder();

        // A for loop runs 'length' times, where 'length' is the desired length of the
        // password.
        for (int i = 0; i < length; i++) {

            // A random index is generated within the range of the 'characters' string
            // length.
            int index = random.nextInt(characters.length());

            // Character at the randomly generated index is appended to the 'password'
            // string.
            password.append(characters.charAt(index));
        }

        // The final password string is returned.
        return password.toString();
    }
}