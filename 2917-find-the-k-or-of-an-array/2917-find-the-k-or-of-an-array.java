class Solution {
    public int findKOr(int[] nums, int k) {
        int a = 0;
        for (int i = 0; i < 31; i++) {
            int c = 0;
            for (int n : nums) {
                if (((n >> i) & 1) == 1) {
                    c++;
                }
            }
            if (c >= k) {
                a = a | (1 << i);
            }
        }
        return a;
    }
}