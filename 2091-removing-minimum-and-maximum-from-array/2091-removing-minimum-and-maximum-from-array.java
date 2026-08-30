class Solution {
    public int minimumDeletions(int[] nums) {
        int minIdx = 0;
        int maxIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[minIdx] > nums[i]) {
                minIdx = i;
            }
            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }
        int l = Math.max(minIdx, maxIdx) + 1;
        int r = nums.length - Math.min(minIdx, maxIdx);
        int b = Math.min(minIdx, maxIdx) + 1 + nums.length - Math.max(minIdx, maxIdx);
        return Math.min(l, Math.min(r, b));
    }
}