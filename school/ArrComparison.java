import java.util.Scanner;

public class ArrComparison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int NUM_VALS = 3;
        int[] arrA = new int[NUM_VALS];
        int[] arrB = new int[NUM_VALS];
        int[] smallerValues = new int[NUM_VALS];
        int i;

        for (i = 0; i < NUM_VALS; ++i) {
            arrA[i] = in.nextInt();
        }

        for (i = 0; i < NUM_VALS; ++i) {
            arrB[i] = in.nextInt();
        }

        for(i = 0; i < NUM_VALS; ++i) {
            if (arrA[i] < arrB[i]) {
                smallerValues[i] = arrA[i];
            } else {
                smallerValues[i] = arrB[i];
            }
        }

        for (i = 0; i < smallerValues.length; ++i) {
            System.out.print(smallerValues[i] + " ");
        }
        System.out.println();
    }
}