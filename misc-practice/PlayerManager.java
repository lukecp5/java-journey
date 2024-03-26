import java.util.ArrayList;
import java.util.Scanner;

/**
 * The PlayerManager class in Java provides methods to add, delete, and print player numbers stored in
 * an ArrayList based on user input commands.
 */
public class PlayerManager {
   // Adds playerNum to end of ArrayList
   public static void addPlayer (ArrayList<Integer> players, int playerNum) {
      players.add(playerNum);
   }

   // Deletes playerNum from ArrayList
   /**
    * The function `deletePlayer` removes a specific player number from an ArrayList of players if it
    * exists.
    * 
    * @param players An ArrayList of Integer values representing player numbers.
    * @param playerNum The `playerNum` parameter in the `deletePlayer` method is the player number that
    * you want to delete from the `players` ArrayList. The method searches for this player number in
    * the ArrayList and removes it if found.
    */
   public static void deletePlayer (ArrayList<Integer> players, int playerNum) {
      int i;
      boolean found;

      // Search for playerNum in ArrayList
      found = false;
      i = 0;

      while ( (!found) && (i < players.size()) ) {
         if (players.get(i).equals(playerNum)) {
            players.remove(i); // Remove
            found = true; 
         }

         ++i;
      }
   }
   
   // Prints player numbers currently in ArrayList
   public static void printPlayers(ArrayList<Integer> players) {
      int i;

      for (i = 0; i < players.size(); ++i) {
         System.out.println(" " + players.get(i));
      }
   }

   // Maintains ArrayList of player numbers 
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Integer> players = new ArrayList<Integer>();
      String userInput;
      int playerNum;

      userInput = "-";

      System.out.println("Commands: 'a' add, 'd' delete,");
      System.out.println("'p' print, 'q' quit: ");

      while (!userInput.equals("q")) {
         System.out.print("Command: ");
         userInput = scnr.next();

         if (userInput.equals("a")) {
            System.out.print(" Player number: ");
            playerNum = scnr.nextInt();

            addPlayer(players, playerNum);
         }
         if (userInput.equals("d")) {
            System.out.print(" Player number: ");
            playerNum = scnr.nextInt();

            deletePlayer(players, playerNum);
         }
         else if (userInput.equals("p")) {
            printPlayers(players);
         }
      }

   }
}