class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int s = 0;
        int l = 0;
        int i = 0;
        int j = nums.length - 1;
        while (k > 0) {
            s += nums[i];
            l += nums[j];
            i++;
            j--;
            k--;
        }
        return Math.abs(s - l);
    }
}