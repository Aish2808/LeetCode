class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i], h.getOrDefault(nums[i], 0) + 1);
        }
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            int f = h.get(nums[i]);
            if(f % k == 0){
                sum += nums[i];
            }
        }
        return sum;
    }
}