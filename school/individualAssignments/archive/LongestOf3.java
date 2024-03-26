package individualAssignments.archive;
import java.util.Scanner;

public class LongestOf3 {
    public static void main(String[] args) {
        // declare and instantiate a Scanner
        Scanner in = new Scanner(System.in);

        // declare and initialize any other needed variables
        String str1, str2;
        String str3;
        String longest;
        int len1, len2, len3;

        // prompt for and collect inputs
        System.out.print("Enter first string   : ");
        str1 = in.nextLine();
        System.out.print("Enter second string  : ");
        str2 = in.nextLine(); 
        System.out.print("Enter third string  : ");
        str3 = in.nextLine();

        len1 = str1.length();
        len2 = str2.length();
        len3 = str3.length();

        // compute required output
        if (len1 > len2 && len1 > len3 ) {
            longest = str1;
        } else if (len2 > len1 && len2 > len3) {
            longest = str2;
        } else {
            longest = str3;
        }
        System.out.println("The longest is : " + longest);
    }
}