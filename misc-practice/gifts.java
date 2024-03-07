import java.util.*;
// import java.util.*;

class Solution {
    // Method to pick gifts
    public int[] pickGifts(int[] gifts, int k) {
        int len = gifts.length;
        int[] sorted = Arrays.copyOf(gifts, len);

        // a Iterate k times
        while (k > 0) {
            // a Sort the array in ascending order
            Arrays.sort(sorted);

            // Get the maximum value from the sorted array
            int maxGifts = sorted[len - 1];

            // Calculate the square root and round down to the nearest integer
            int sqrtFloor = (int) Math.floor(Math.sqrt(maxGifts));

            // A Replace the maximum value with the square root
            sorted[len - 1] = sqrtFloor;
            // Decrement k
            k--;
        }

        // return [0,1]
        // return new int[]{0, 1};

        for (int i = 0; i < len;) {
            System.out.println("sorted[" + i + "]: " + sorted[i]);
        }
        long remainingGifts = 0;
        // Calculate the sum of all elements in the sorted array
        for (int i = 0; i < len; i++) {
            remainingGifts += sorted[i];
        }

        return remainingGifts; // Return the sum of remaining gifts
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 25;
        arr[1] = 64;
        arr[2] = 9;
        arr[3] = 4;
        arr[4] = 100;

        System.out.println("arr: " + Arrays.toString(arr)); // Print the original array
        Solution sol = new Solution();
        int k = 4;
        long remainingGifts = sol.pickGifts(arr, k); // Call the pickGifts method
        System.out.println("Remaining gifts: " + remainingGifts); // Print the sum of remaining gifts
    }
}