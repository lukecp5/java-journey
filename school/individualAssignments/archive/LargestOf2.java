package individualAssignments.archive;

// add any needed import statements
import java.util.Scanner;

public class LargestOf2 {
   public static void main(String[] args) {
      // declare and instantiate a Scanner
      Scanner in = new Scanner(System.in);

      // declare and initialize any other needed variables
      int num1, num2;

      // prompt for and collect inputs
      System.out.print("Enter first integer   : ");
      num1 = in.nextInt();
      System.out.print("Enter second integer  : ");
      num2 = in.nextInt();

      // compute required output
      System.out.println("Largest integer is: " + (num1 > num2 ? num1 : num2));

      in.close();
   }
}
