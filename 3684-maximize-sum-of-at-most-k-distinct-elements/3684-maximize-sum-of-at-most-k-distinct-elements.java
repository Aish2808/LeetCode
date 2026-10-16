class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer> s = new HashSet();
        Arrays.sort(nums);
        int a[] = new int[k];
        int j = 0;
        for (int i = nums.length - 1; i >= 0 && j < k; i--) {
            if (s.add(nums[i])) {
                a[j] = nums[i];
                j++;
            }
        }
        return Arrays.copyOf(a, j);
    }
}