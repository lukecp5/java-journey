package archive.school;

import java.util.Scanner;

public class HighwayInfo {
    public static void main(String[] args) {
        // declare and instantiate a Scanner
        Scanner in = new Scanner(System.in);

        // Declare variables needed
        int usrHwy = 0;
        int hwyNum = 0;
        String aux = "";
        String dir = "";
        String NS = " north/south.";
        String EW = " east/west.";

        // * Prompt user for highway number and store in usrHwy *
        System.out.println("Enter the highway number : ");
        usrHwy = in.nextInt();
        
        in.close();

        // Conditional statements to determine direction and actual highway number
        if (usrHwy % 2 == 0) {
            dir = EW;
        } else {
            dir = NS;
        }
        if (usrHwy > 100) {
            aux = "auxilliary, serving the";
            hwyNum = usrHwy % 100;
            System.out.printf("The %d is %s %d, going %s", usrHwy, aux, hwyNum, dir);
        } else {
            aux = "primary, going ";
            hwyNum = usrHwy;
            System.out.printf("The %d is %s%s", hwyNum, aux, dir);
        }
    }
}
