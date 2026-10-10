class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int a[] = new int[nums1.length];
        int md = 0;
        long td = 0;
        for (int i = 0; i < nums1.length; i++) {
            a[i] = Math.abs(nums1[i] - nums2[i]);
            md = Math.max(md, a[i]);
            td += a[i];
        }
        long k = (long) k1 + k2;
        if (k >= td) {
            return 0;
        }
        int l = 0;
        int h = md;
        while (l != h) {
            int m = l + (h - l) / 2;
            long n = 0;
            for (int i : a) {
                if (i > m) {
                    n += i - m;
                }
            }
            if (n > k) {
                l = m + 1;
            } else {
                h = m;
            }
        }
        long u = 0;
        long s = 0;
        for (int i : a) {
            int d = Math.min(i, l);
            u += i - d;
            s += (long) d * d;
        }
        long r = k - u;
        if (l > 0) {
            s -= r * ((long) 2 * l - 1);
        }
        return s;
    }
}