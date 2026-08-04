class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> s1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            s1.add(nums1[i]);
        }
        HashSet<Integer> s2 = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            s2.add(nums2[i]);
        }
        HashSet<Integer> s3 = new HashSet<>();
        for (int i = 0; i < nums3.length; i++) {
            s3.add(nums3[i]);
        }
        List<Integer> a = new ArrayList<>();
        for (int i : s1) {
            if (s2.contains(i) || s3.contains(i)) {
                a.add(i);
            }
        }
        for (int i : s2) {
            if (s3.contains(i) && !a.contains(i)) {
                a.add(i);
            }
        }
        return a;
    }
}