class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
        int left = 0;
        while (left < nums.length - 1) {
            int a = 0;
            for (int i = 0; i <= left; i++) {
                a += nums[i];
            }
            int b = 0;
            for (int i = left + 1; i < nums.length; i++) {
                b += nums[i];
            }
            int n = a - b;
            if (n % 2 == 0) {
                count++;
            }
            left++;
        }
        return count;
    }
}