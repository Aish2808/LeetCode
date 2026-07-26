class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        if (n == 3) {
            return nums[0] * nums[1] * nums[2];
        }
        int f = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;
        int t = Integer.MIN_VALUE;
        int ss = Integer.MAX_VALUE;
        int ts = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] > f) {
                t = s;
                s = f;
                f = nums[i];
            } else if (nums[i] > s) {
                t = s;
                s = nums[i];
            } else if (nums[i] > t) {
                t = nums[i];
            }
            if (nums[i] < ts) {
                ss = ts;
                ts = nums[i];
            } else if (nums[i] < ss) {
                ss = nums[i];
            }
        }
        int o1 = f * s * t;
        int o2 = f * ss * ts;
        return Math.max(o1, o2);
    }
}