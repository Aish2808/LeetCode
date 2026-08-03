class Solution {
    public int maxFrequencyElements(int[] nums) {
        int a[] = new int[101];
        for (int i = 0; i < nums.length; i++) {
            a[nums[i]]++;
        }
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (max == a[i]) {
                count++;
            }
        }
        return max * count;
    }
}