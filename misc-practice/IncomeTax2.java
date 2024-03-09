import java.util.Scanner;

public class IncomeTax {
        public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int annualSalary;
        double taxRate;
        int taxToPay;
        int i;
        final String USER_PROMPT = "\nEnter annual salary (negative to exit)";

        // The first entries in the two tables are 0 to catch annualSalary < 0
        int[] salaryBase = { 0, 20000, 50000, 100000, 999999999 };
        double[] taxBase = { 0.0, 0.10, 0.20, 0.30, 0.40 };

        annualSalary = promptForInteger(scnr, USER_PROMPT);

        while (annualSalary >= 0) {
            taxRate = getCorrespondingTableValue(annualSalary, salaryBase, taxBase);

            taxToPay = (int) (annualSalary * taxRate); // Truncate tax to an integer amount
            System.out.println("Annual salary: " + annualSalary +
                    "\nTax rate: " + taxRate +
                    "\nTax to pay: " + taxToPay);

            // Get the next annual salary
            annualSalary = promptForInteger(scnr, USER_PROMPT);
        }
    }
}