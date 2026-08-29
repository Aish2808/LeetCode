class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> a = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            boolean add = false;
            for (List<Integer> r : a) {
                Set<Integer> s = new HashSet<>();
                if (!r.contains(nums[i])) {
                    r.add(nums[i]);
                    add = true;
                    break;
                }
            }
            if (!add) {
                List<Integer> nr = new ArrayList<>();
                nr.add(nums[i]);
                a.add(nr);
            }
        }
        return a;
    }
}