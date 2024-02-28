package school;
import java.util.Scanner;

public class OutputElements {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scnr.nextLine();
        scnr.close();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            System.out.print(inputString.charAt(i));
            if (i != 0) {
                System.out.print("/");
            }
        }
    }
}

