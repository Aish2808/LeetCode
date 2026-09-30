class Solution {
    public int minStartValue(int[] nums) {
        int s = Integer.MAX_VALUE;
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a += nums[i];
            s = Math.min(s, a);
        }
        int m = Math.max(1, 1 - s);
        return m;
    }
}