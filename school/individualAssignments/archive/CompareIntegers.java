package individualAssignments.archive;
import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int first = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int second = scanner.nextInt();

        if (first > second) {
            System.out.println(first + " is greater than " + second);
        } else if (first < second) {
            System.out.println(first + " is less than " + second);
        } else {
            System.out.println(first + " is equal to " + second);
        }
    }
}