package individualAssignments.archive;

// make any necessary imports here (for example, you will need a Scanner)
import java.util.Scanner;

public class GenesGreen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l, w;

        System.out.print("Enter Course Length : ");
        l = in.nextInt();

        System.out.print("Enter Course Width  : ");
        w = in.nextInt();

        System.out.println();

        System.out.printf("Total square yards of rough sod  : %d\n",
                rSod(areaOfRectangle(l, w), smSod(w, l), areaOfSandTrap(w)));
        System.out.printf("Total square yards of smooth sod : %d\n", smSod(w, l));

        System.out.printf("Tons of sand                     : %d\n", (int) tonsOfSand(w));
        // call your methods to compute the required outputs

        // display the results

    }

    // copy your method definitions from the previous parts here below
    public static double areaOfRectangle(double l, double w) {
        double area = w * l;
        return area;
    }

    public static double areaOfCircle(double d) {
        double area = 3.1415 * Math.pow(d / 2, 2);
        return area;
    }

    public static double perimeterOfRectangle(double w, double h) {
        return (2 * w) + (2 * h);
    }

    public static double perimeterOfCircle(double d) {
        double r = d / 2.0;
        return 2 * 3.1415 * r;
    }

    public static int numberOfBushes(double w, double l) {
        return (int) ((w * 2.0 + l * 2.0) - 2.0);
    }

    public static double areaOfSandTrap(double w) {

        // System.out.println("areaOfCircle(w * .25): " + areaOfCircle(w * .25));
        return areaOfCircle(w * .25);
    }

    public static double areaOfPuttingGreen(double w) {
        return areaOfCircle(w * (2.0 / 3.0));
    }

    public static double areaOfTee(double w) {
        return areaOfCircle(w / 3);
    }

    public static int smSod(double w, double l) {
        return (int) Math.ceil(areaOfTee(w) + areaOfPuttingGreen(w));
    }

    public static int rSod(double area, double smoothSod, double sand) {
        return (int) Math.ceil(area - smoothSod - sand);
    }

    public static double tonsOfSand(double w) {
        double sandTrapArea = areaOfSandTrap(w) * 9.0;
        double sandTrapVolume = sandTrapArea * 2.0; // Assuming sand trap is always 2 feet deep
        double sandWeight = sandTrapVolume * 80.0; // Assuming sand weighs 80 lbs. per cubic foot
        // System.out.println("sandWeight: " + sandWeight);
        double tonsOfSand = Math.ceil(sandWeight / 2000.0); // Assuming 1 ton = 2000 lbs.

        return tonsOfSand;
    }
}
