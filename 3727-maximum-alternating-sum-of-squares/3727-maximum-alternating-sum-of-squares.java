class Solution {
    public long maxAlternatingSum(int[] nums) {
        long a[] = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(a);
        int l = 0;
        int r = nums.length - 1;
        long s = 0;
        while (l <= r) {
            if (l == r) {
                s += a[r];
            } else {
                s += a[r] - a[l];
            }
            r--;
            l++;
        }
        return s;
    }
}