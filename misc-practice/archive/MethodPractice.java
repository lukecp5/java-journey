public class MethodPractice {
    public static void main(String[] args) {
        MethodPractice mp = new MethodPractice();
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(mp.minPlusMax(arr));
    }

    public int minPlusMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return min + max;
    }
}
