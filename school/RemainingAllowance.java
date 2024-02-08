package archive.school;

// Integer dollarAmount is read from input. Write multiple if statements:
// If dollarAmount is greater than or equal to 16, then output "Buy new shoes."
// If dollarAmount is greater than 26, then output "Buy a new coat."
// If dollarAmount is less than 1, then output "Save money."
// End each output with a newline.

import java.util.Scanner;

public class RemainingAllowance {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int dollarAmount;
   
      dollarAmount = scnr.nextInt();
    
        if (dollarAmount >= 16) {
             System.out.println("Buy new shoes.");
        }
        if (dollarAmount >= 26) {
             System.out.println("Buy a new coat.");
        }
        if (dollarAmount < 1) {
             System.out.println("Save money.");
        }
        scnr.close();
   }
}
