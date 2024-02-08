import java.util.Scanner;

public class replaceStrings {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String dataFields;
        String convertedDataFields;

        dataFields = scnr.nextLine();
        System.out.println("You entered: " + dataFields);

        convertedDataFields = dataFields.replaceAll("teal", "gold");
        System.out.println("Converted data fields: " + convertedDataFields);
    }
}