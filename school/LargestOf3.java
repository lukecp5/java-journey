package school;
// Write a Java program, that prompts for and collects three inputs (all inputs will be ints). After collecting the inputs, this program should determine the largest of the three input values and print out a message indicating which input value is largest.

// Here are some examples of how this program should look when it runs:

// Example 1:

// Enter first integer  : 3
// Enter second integer : 5
// Enter third Integer  : 8

// The largest is : 3
// Example 2:

// Enter first integer  : 7
// Enter second integer : 2
// Enter third Integer  : 4

// The largest is : 2
// Example 3:

// Enter first integer  : 5
// Enter second integer : 6
// Enter third Integer  : 1

// The largest is : 1
// Example 4:

// Enter first integer  : 2
// Enter second integer : 7
// Enter third Integer  : 2

// The largest is : 2
// Make sure that, for each set of example inputs above, your program output is identical to the example program output (including spelling, capitalization, spaces, and punctuation).

// add any needed import statements

import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        // declare and instantiate a Scanner
        Scanner in = new Scanner(System.in);

        // declare and initialize any other needed variables
        int num1, num2, num3;

        // prompt for and collect inputs
        System.out.print("Enter first integer  : ");
        num1 = in.nextInt();
        System.out.print("Enter second integer : ");
        num2 = in.nextInt();
        System.out.print("Enter third integer  : ");
        num3 = in.nextInt();

        // compute required output
        if (num1 > num2 && num1 > num3 || num1 == num2 && num1 > num3 || num1 == num3 && num1 > num2) {
            System.out.println("The largest is : " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The largest is : " + num2);
        } else {
            System.out.println("The largest is : " + num3);
        }
    }
}
