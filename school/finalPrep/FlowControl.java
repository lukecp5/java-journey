package finalPrep;

public class FlowControl {
    public static void main(String[] args) {
        int[] n = { 3, 2, 4, 5, 2, 4, 7, 2, 9, 13, 50, 23, 10, 19, 92 };
        System.err.println(minPlusMax(n));
    }

    public static int minPlusMax(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min)
                min = Math.min(min, nums[i]);
            if (nums[i] > max)
                max = Math.max(max, nums[i]);
        }
        return min + max;
    }
}
