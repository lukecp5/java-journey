package leetcode;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int[] shuffled = shuffle(nums, n);
        System.out.println(shuffled.toString());
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n * 2];

        for (int i = 0, j = 0; i < n; i++) {
            // Take the current element from the first half of the array and assign it to
            // the corresponding position in the shuffled array
            ans[j++] = nums[i];

            // Take the current element from the second half of the array and assign it to
            // the corresponding position in the shuffled array
            ans[j++] = nums[i + n];
        }

        return ans;
    }
}