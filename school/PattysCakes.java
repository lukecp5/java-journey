package school;

// import any necessary packages here below
import java.util.Scanner;

public class PattysCakes {

    public static void main(String[] args) {
        // Print welcome message and prompt the user to choose 4 or 6 pack of cupcakes
        System.out.println("Welcome to Patty's Cakes!\n");
        int numCupcakes = 0;
        Scanner in = new Scanner(System.in);

        while (numCupcakes != 4 && numCupcakes != 6) {
            System.out.print("How many cupcakes would you like, 4 or 6? ");
            numCupcakes = in.nextInt();

            if (numCupcakes != 4 && numCupcakes != 6) {
                System.out.println("Invalid selection, please try again.");
            }
        }

        // Display menu
        System.out.println("Great! Let's start filling your " + numCupcakes + "-pack.");

        System.out.println();
        System.out.println("Cupcake Menu:");
        System.out.println("1. Vanilla Delight:  $2.50");
        System.out.println("2. Chocolate Dream:  $3.00");
        System.out.println("3. Strawberry Bliss: $2.75");
        System.out.println("4. Caramel Drizzle:  $3.50");

        double salesCost = 0.0;
        String cupcakeList = "";

        // Gets cupcake selections from user
        for (int i = 1; i <= numCupcakes; i++) {
            int selection = 0;
            while (selection >= 5 || selection < 1) {
                System.out.print("Select cupcake #" + i + ": ");
                selection = in.nextInt();
                if (selection > 4 || selection < 1) {
                    System.out.println("Invalid selection, please try again.");
                }
            }

            switch (selection) {
                case 1:
                    salesCost += 2.50;
                    cupcakeList += "   - Vanilla Delight\n";
                    break;
                case 2:
                    cupcakeList += "   - Chocolate Dream\n";
                    salesCost += 3.00;
                    break;
                case 3:
                    cupcakeList += "   - Strawberry Bliss\n";
                    salesCost += 2.75;
                    break;
                case 4:
                    cupcakeList += "   - Caramel Drizzle\n";
                    salesCost += 3.50;
                    break;
            }
        }
        System.out.println("Here are the cupcakes in your pack: ");
        System.out.println(cupcakeList);
        // System.out.println();

        System.out.printf("Sales Total:      $%.2f\n", salesCost);

        double tax = salesCost * 0.08;
        System.out.printf("8%% Sales Tax:     $%.2f\n", tax);

        double total = tax + salesCost;
        System.out.printf("Total:            $%.2f\n", total);

        System.out.println();
        System.out.println("Thank you for ordering from Patty's Cakes!");
    }
}