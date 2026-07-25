class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int n1 = Integer.MAX_VALUE;
        int n2 = Integer.MAX_VALUE;
        for (int i = 0; i < nums1.length; i++) {
            n1 = Math.min(n1, nums1[i]);
            n2 = Math.min(n2, nums2[i]);
        }
        return n2 - n1;
    }
}