class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        a1.add(nums[0]);
        a2.add(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (a1.get(a1.size() - 1) > a2.get(a2.size() - 1)) {
                a1.add(nums[i]);
            } else {
                a2.add(nums[i]);
            }
        }
        int n = 0;
        for (int k = 0; k < a1.size(); k++) {
            nums[n] = a1.get(k);
            n++;
        }
        for (int k = 0; k < a2.size(); k++) {
            nums[n] = a2.get(k);
            n++;
        }
        return nums;
    }
}