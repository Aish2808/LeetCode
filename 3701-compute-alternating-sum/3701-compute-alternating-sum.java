class Solution {
    public int alternatingSum(int[] nums) {
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                r += nums[i];
            } else {
                r -= nums[i];
            }
        }
        return r;
    }
}