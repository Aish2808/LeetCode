class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int diff = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = (i + 1) % nums.length;
            int d = Math.abs(nums[i] - nums[n]);
            diff = Math.max(diff, d);
        }
        return diff;
    }
}