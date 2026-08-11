class Solution {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length <= 2) {
            return -1;
        }
        int s = Integer.MAX_VALUE;
        int l = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            s = Math.min(s, nums[i]);
            l = Math.max(l, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != s && nums[i] != l) {
                return nums[i];
            }
        }
        return -1;
    }
}