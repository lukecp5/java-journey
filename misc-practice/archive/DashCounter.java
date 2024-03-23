package archive;
import java.util.Scanner;

public class DashCounter {

    public static void main(String[] args) {
        int i;
        int dashCount = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the data fields: ");
        String dataFields = in.nextLine();
for (i = 0; i < dataFields.length(); i++) {
    int dashIndex = 0;
    if (dataFields.charAt(i) == '-') {
        dashIndex = i;
        dashCount += 1;
        System.out.println("Dash found at index " + dashIndex);
    }
}
        System.out.println("Dash occurs " + dashCount + " times.");
    }
}
