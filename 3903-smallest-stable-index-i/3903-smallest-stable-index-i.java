class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int l = 0;
        int r = nums.length - 1;
        int idx = -1;
        while (l < nums.length) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i <= l; i++) {
                max = Math.max(max, nums[i]);
            }
            int min = Integer.MAX_VALUE;
            for (int i = l; i <= r; i++) {
                min = Math.min(min, nums[i]);
            }
            int c = Math.abs(max - min);
            if (c <= k) {
                idx = l;
                break;
            }
            l++;
        }
        return idx;
    }
}