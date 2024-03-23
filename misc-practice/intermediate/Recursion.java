package intermediate;
public class Recursion {
    //B Recursive method to calculate the factorial of a number
    public static int factorial(int n) {
        // Base case: if n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        }

        //B   Recursive case: multiply n with the factorial of (n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;

        // Call the factorial method and print the result
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}





