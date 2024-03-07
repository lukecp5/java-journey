package leetcode;

/**
 * The JewelsAndStones class is used to count the number of jewels in a given set of stones.
 * It provides a method to calculate the count of jewels in stones based on the given input.
 */
public class JewelsAndStones {
    /**
     * Calculates the number of jewels in the given set of stones.
     *
     * @param jewels The string representing the types of jewels.
     * @param stones The string representing the set of stones.
     * @return The count of jewels in the stones.
     */
    public int numJewelsInStones(String jewels, String stones) {
        // Initialize a variable to keep track of the count of jewels
        int count = 0;
        
        // Iterate through each character in the stones string
        for (char stone : stones.toCharArray()) {
            // Check if the current stone is present in the jewels string
            if (jewels.indexOf(stone) != -1) {
                // If the stone is a jewel, increment the count
                count++;
            }
        }
        
        // Return the final count of jewels in the stones
        return count;
    }
}
