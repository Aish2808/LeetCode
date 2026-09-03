class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid = nums.length / 2;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[mid]) {
                c++;
            }
        }
        if (c == 1) {
            return true;
        }
        return false;
    }
}