class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            s.add(nums[i]);
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }
        List<Integer> a = new ArrayList<>();
        for (int i = min + 1; i < max; i++) {
            if (!s.contains(i)) {
                a.add(i);
            }
        }
        return a;
    }
}