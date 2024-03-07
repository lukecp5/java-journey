import java.util.Scanner;

public class userNum {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;

        System.out.print("Enter a number: ");
        userNum = scnr.nextInt();

        for (int i = 0; i <= userNum; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}