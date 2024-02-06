import java.util.Scanner;

public class MultIfElse {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numberOfParts;

      numberOfParts = scnr.nextInt();

      /* If integer numberOfParts is:

1, output "Monad".
3, output "Triad".
4, output "Tetrad" */
      
        if (numberOfParts == 1) {
             System.out.println("Monad");
        }
        else if (numberOfParts == 3) {
             System.out.println("Triad");
        }
        else if (numberOfParts == 4) {
             System.out.println("Tetrad");
        }
        else {
             System.out.println("Error");
        }
   }
}