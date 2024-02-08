package archive.school;

// add any needed import statements
import java.util.Scanner;

public class HighestNumber {
    public static void main(String[] args) {

        // declare and instantiate a Scanner
        Scanner in = new Scanner(System.in);

        // Variable Declarations
        int num1, num2;
        System.out.print("Enter first integer   : ");
        num1 = in.nextInt();
        System.out.print("Enter second integer  : ");
        num2 = in.nextInt();

        if (num1 < num2) {
            System.out.println("The smallest is : " + num1);
        } else {
            System.out.println("The smallest is : " + num2);
        }
        
    }
}
