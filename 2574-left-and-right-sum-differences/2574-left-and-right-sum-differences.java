class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ans[] = new int[nums.length];
        if (nums.length == 1) {
            ans[0] = 0; 
            return ans;
        }
        int leftSum[] = new int[nums.length];
        int rightSum[] = new int[nums.length];
        for (int i = 1; i < leftSum.length; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }
        for (int j = rightSum.length - 2; j >= 0; j--) {
            rightSum[j] = rightSum[j + 1] + nums[j + 1];
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;
    }
}