package arrays;
import java.util.ArrayList;

public class ArrayList2D {
    public static void main(String[] args) {
        System.out.println("ArrayList of ArrayLists from method:");
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> row1 = new ArrayList<Integer>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        list.add(row1);
        ArrayList<Integer> row2 = new ArrayList<Integer>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        list.add(row2);
        ArrayList<Integer> row3 = new ArrayList<Integer>();
        row3.add(7);
        row3.add(8);
        row3.add(9);
        list.add(row3);
        prt(list);

        System.out.println("ArrayList of ArrayLists from main System.out.println(ArrayList<ArrayList<Integer>> list):");
        System.out.println(list);
    }

    public static void prt(ArrayList<ArrayList<Integer>> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
