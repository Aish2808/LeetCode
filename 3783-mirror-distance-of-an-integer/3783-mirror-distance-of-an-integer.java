class Solution {
    public int mirrorDistance(int n) {
        int w = n;
        int r = 0;
        while (w > 0) {
            int l = w % 10;
            r = r * 10 + l;
            w /= 10;
        }
        return Math.abs(n - r);
    }
}