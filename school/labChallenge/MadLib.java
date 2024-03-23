
import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int num_1 = scanner.nextInt();

        System.out.print("Enter another whole number: ");
        int num_2 = scanner.nextInt();

        System.out.print("Enter any number: ");
        double num_3 = scanner.nextDouble();

        System.out.print("Enter a noun: ");
        String noun = scanner.next();

        System.out.print("Enter proper name: ");
        String proper_name = scanner.next();

        System.out.print("Enter a verb: ");
        String verb = scanner.next();

        System.out.print("Enter an adjective: ");
        String adjective_1 = scanner.next();

        System.out.print("Enter another adjective: ");
        String adjective_2 = scanner.next();

        scanner.close();

        System.out.println("One day, " + num_1 + " " + noun
                
                
                
                
                + "(s) wanted to cross a bridge over a river. Under that bridge lived a(n) " + adjective_1
                + " Troll weighing " + String.format("%.2f", num_3) + " pounds, with " + num_2 + " eyes and "
                + adjective_2 + " hair, named " + proper_name + ". " + proper_name + " said to the " + noun + "(s) \""
                + verb + " away, or I will have to eat you!\".");
    }
}
