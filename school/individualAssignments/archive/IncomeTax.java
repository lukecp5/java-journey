package individualAssignments.archive;
import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        final int MAX_ELEMENTS = 10;
        Scanner scnr = new Scanner(System.in);
        int annualSalary;
        double taxRate;
        int taxToPay;
        int numSalaries;
        boolean keepLooking;
        int i;

        int[] salaryBase = { 20000, 50000, 100000, 999999999 };
        double[] taxBase = { .10, .20, .30, .40 };

        int[] annualSalaries = new int[MAX_ELEMENTS];
        int[] taxesToPay = new int[MAX_ELEMENTS];

        numSalaries = 0;

        System.out.println("\nEnter annual salary (0 to exit): ");
        annualSalary = scnr.nextInt();

        while (annualSalary > 0 && numSalaries < MAX_ELEMENTS) { // Valid annualSalary entered
            i = 0;
            taxRate = 0;
            keepLooking = true;

            // Search for appropriate table row for given annualSalary
            while ((i < salaryBase.length) && keepLooking) {
                if (annualSalary <= salaryBase[i]) {
                    taxRate = taxBase[i];
                    keepLooking = false;
                } else {
                    ++i;
                }
            } // End inner while loop (search for appropriate table row)

            taxToPay = (int) (annualSalary * taxRate); // Truncate tax to an integer amount

            // Insert code to include entries to the annual salaries and taxes to pay
            // tables. Replace the appropriate variables with the array reference.
            annualSalaries[numSalaries] = annualSalary;
            taxesToPay[numSalaries] = taxToPay;
            numSalaries++;

            System.out.println("Annual salary: " + annualSalary +
                    "\tTax rate: " + taxRate +
                    "\tTax to pay: " + taxToPay);

            // Get the next annual salary
            System.out.println("\nEnter annual salary  (0 to exit): ");
            annualSalary = scnr.nextInt();
        } // End outer while loop (valid annualSalary entered)

        // Challenge - add code to sum the annual salaries and taxes to pay
        // and print the totals2
        int totalSalaries = 0;
        int totalTaxes = 0;
        for (int j = 0; j < numSalaries; j++) {
            totalSalaries += annualSalaries[j];
            totalTaxes += taxesToPay[j];
        }
        System.out.println("\nTotal annual salaries: " + totalSalaries);
        System.out.println("Total taxes to pay: " + totalTaxes);
    }
}
