class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int streak = 1, maxStreak = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                continue;
            }
            if (nums[i]+1 == nums[i+1]) {
                streak++;
            }
            else {
                streak = 1;
            }
            maxStreak = Math.max(streak, maxStreak);
        }
        return maxStreak;
    }
}
