import java.util.Scanner;

public class SmallestValues {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int valCount;

        double inVal;

        double smallestVal = 0.0;

        int i;

        System.out.println("Enter the number of values to compare: ");
        valCount = scnr.nextInt();

        System.out.println("Enter first value:");
        inVal = scnr.nextDouble();

        System.out.println("Value read: " + inVal);

        smallestVal = inVal;

        for (i = 0; i < valCount; ++i) {
            System.out.println("Enter next value:");
            inVal = scnr.nextDouble();

            System.out.println("Value read: " + inVal);

            if (inVal < smallestVal) {

                smallestVal = inVal;

            }

        }

        System.out.println("Smallest: " + smallestVal);
        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 1;
        arr[3] = 5;
        arr[4] = 4;
        
    }

}