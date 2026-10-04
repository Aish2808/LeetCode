class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int l = i - k;
            int r = i + k;
            if ((l < 0 || a > nums[l]) && (r >= nums.length || a > nums[r])) {
                s += a;
            }
        }
        return s;
    }
}