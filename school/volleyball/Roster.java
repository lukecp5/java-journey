package volleyball;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Roster {
    private ArrayList<Player> playerList;

    public Roster() {
        playerList = new ArrayList<Player>();
    }

    public Roster(String file) throws FileNotFoundException {
        playerList = new ArrayList<Player>();

        FileInputStream fis = new FileInputStream("individualAssignments/volleyball/" + file);
        Scanner in = new Scanner(fis);

        while (in.hasNextLine()) {
            String fullN = "";
            String n = in.next();
            String n2 = in.next();
            fullN = n + " " + n2;
            double a = in.nextDouble();
            double b = in.nextDouble();

            Player newGuy = new Player(fullN, a, b);
            playerList.add(newGuy);
            if (in.hasNextLine())
                in.nextLine();
        }
    }

    public void addPlayer(String n, double a, double b) {
        Player newGuy = new Player(n, a, b);
        playerList.add(newGuy);
    }

    public int getPlayerCount() {
        return playerList.size();
    }

    public Player getPlayerByName(String n) {
        for (Player p : playerList) {
            if (p.getName().equals(n))
                return p;
        }
        return null;
    }

    public void printTopAttackers() {
        Player top = playerList.get(0);
        Player top2 = playerList.get(0);
        int i;
        double topAtk = 0.0, topAtk2 = 0.0;
        for (Player p : playerList) {
            double atk = p.getAttackScore();
            if (atk >= topAtk) {
                if (topAtk > topAtk2) {
                    topAtk2 = topAtk;
                    top2 = top;
                }
                topAtk = atk;
                top = p;
            } else if (atk >= topAtk2) {
                topAtk2 = atk;
                top2 = p;
            } else {
                continue;
            }
        }

        top.printInfo();
        top2.printInfo();
    }

    public void printTopBlockers() {
        Player top = playerList.get(0);
        Player top2 = playerList.get(0);

        double topBlk = 0.0, topBlk2 = 0.0;
        for (Player p : playerList) {
            double blk = p.getBlockScore();
            if (blk > topBlk) {
                if (topBlk > topBlk2) {
                    topBlk2 = topBlk;
                    top2 = top;
                }
                topBlk = blk;
                top = p;
            } else if (blk >= topBlk2) {
                topBlk2 = blk;
                top2 = p;
            } else {
                continue;
            }
        }

        top.printInfo();
        top2.printInfo();

    }

    public void printAllPlayers() {
        System.out.println("PLACEHOLDER FOR PRINT ALL PLAYERS");
    }
    /**
     * a method named addPlayer. This method will take three arguments. The first
     * argument will be a String (player's name). The second (attack score) and
     * third (block score) arguments will be double.
     * a method named getPlayerCount. This method will take no arguments. This
     * method will return an int.
     * a method named getPlayerByName. This method will take one String argument.
     * This method will return a Player reference.
     * a method named printTopAttackers. This method will take no arguments. This
     * method will not return anything.
     * a method named printTopBlockers. This method will take no arguments. This
     * method will not return anything.
     * a method named printAllPlayers. This method will take no arguments. This
     * method will not return anything.
     */

}