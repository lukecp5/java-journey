package arrays;

public class ArraysAndLoops {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            
            System.out.printf("|%-3d|", numbers[i]);
            System.out.printf("|%-3d|", numbers[i]);
            System.out.printf("|%-3d|", numbers[i]);
            System.out.printf("|%-3d|", numbers[i]);
            System.out.printf("|%-3d|", numbers[i]);

            for(int j = 0; j < numbers.length; j++){
                System.out.printf("------%s\n", "------");
                System.out.printf("-%-8d-", numbers[j]);
            }
        }
    }
}