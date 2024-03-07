package school.individualAssignments;
/*
 * When the input integer variable numberOfTools is:

greater than or equal to 32, output "Need wall storage".
between 11 inclusive and 32 exclusive, output "Full-sized tool box".
between 0 exclusive and 10 inclusive, output "Mid-sized tool box".
less than or equal to 0, output "Invalid input".
End with a newline.
 */

 import java.util.Scanner;

public class ToolBoxData {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numberOfTools;
      
      numberOfTools = scnr.nextInt();

   /* Your code goes here */
        if (numberOfTools >= 32) {
             System.out.println("Need wall storage");
        }
        else if (numberOfTools >= 11) {
             System.out.println("Full-sized tool box");
        }
        else if (numberOfTools > 0) {
             System.out.println("Mid-sized tool box");
        }
        else {
             System.out.println("Invalid input");
        }

   }
}