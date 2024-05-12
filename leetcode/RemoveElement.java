public class RemoveElement {
    

    public int removeElement(int[] nums, int val) {
        int index = 0, i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

}
