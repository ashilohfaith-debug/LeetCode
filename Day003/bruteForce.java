class Solution {
    public int[] twoSum(int[] nums, int target) {
        int r[] =new int[2];
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if ((i != j) && (nums[j] + n == target)) {
                    r[0] = i;
                    r[1] = j;
                    return r;
                }
            }
        }
        return r;
    }
}
