class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String s = String.valueOf(nums[i]);
            for (int j = 0; j < s.length(); j++) {
                a.add(s.charAt(j) - '0');
            }
        }
        int arr[] = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            arr[i] = a.get(i);
        }
        return arr;
    }
}