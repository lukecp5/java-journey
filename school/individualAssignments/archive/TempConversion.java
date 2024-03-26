package individualAssignments.archive;

import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        // Below this comment: declare and instantiate a Scanner
        Scanner scnr = new Scanner(System.in);
        Double kelvin = 0.0;
        Double fer = 0.0;

        System.out.print("Enter temperature in Kelvin : ");
        kelvin = scnr.nextDouble();

        fer = ((kelvin - 273.15) * 9.0 / 5.0) + 32.0;
        // Below this comment: collect the requried inputs from the user
        // The line `// double kelvin = 0.0;` is a commented-out line in the code. It is
        // not currently
        // being used in the program. It appears to be a leftover or a placeholder for
        // declaring and
        // initializing a variable named `kelvin` with a value of `0.0`. However, since
        // it is commented
        // out, it is not active or affecting the program's functionality.

        // double fer = kelvin - 273.15;
        // double fer2 = fer * 9.0 / 5.0;
        // double fer3 = fer2 + 32.0;

        // Below this comment: declare any other variables you may need
        System.out.printf("%.2f degrees Kelvin is %.2f degrees Fahrenheit\n", kelvin, fer);

    }
}