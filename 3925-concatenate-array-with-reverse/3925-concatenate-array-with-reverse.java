class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int a = n * 2;
        int w = a - 1;
        int kak[] = new int[a];
        for(int i=0;i<n;i++){
            kak[i] = nums[i];
            kak[w] = nums[i];
            w--;
        }
        return kak;
    }
}