public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] nums1 = new int[nums.length];
        int prod = 1, countZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                prod = prod * nums[i];
            }
            else
                countZero++;
        }
        if (countZero > 1) {
            return new int[nums.length];
        }
        for (int i = 0; i < nums.length; i++) {
            if (countZero == 0) {
                nums1[i] = prod / nums[i];
            }
            else if (countZero == 1) {
                nums1[i] = (nums[i] == 0) ? prod : 0;
            }
        }
        return nums1;
    }
}
