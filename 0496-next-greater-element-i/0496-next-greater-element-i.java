class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int a[] = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            a[i] = -1;
            int n = nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                if (n == nums2[j]) {
                    if (j != nums2.length - 1) {
                        for (int k = j + 1; k < nums2.length; k++) {
                            if (nums2[j] < nums2[k]) {
                                a[i] = nums2[k];
                                break;
                            }
                        }
                    }
                    break;
                }
            }
        }
        return a;
    }
}