package school.archive;

import java.util.Scanner;

public class OutputElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String inputStr = in.hasNext() ? in.next() : "";
        // String inputStr = in.next();
        // in.close();

        for (int i = inputStr.length() - 1; i >= 0; i--) {
            System.out.print(inputStr.charAt(i));
            if (i != 0) {
                System.out.print("/");
            }
        }
        in.close();
    }
}
