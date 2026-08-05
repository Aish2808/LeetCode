class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> s = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            s.put(nums[i], s.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> l = new ArrayList<>();
        int n = nums.length / 3;
        for (int i : s.keySet()) {
            int c = s.get(i);
            if (c > n) {
                l.add(i);
            }
        }
        return l;
    }
}