import java.util.stream.*;

public class intStream {

    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int subSum = IntStream.of(nums).limit(i + 1).sum();
            sum[i] = subSum;
        }
        return sum;
    }
}
