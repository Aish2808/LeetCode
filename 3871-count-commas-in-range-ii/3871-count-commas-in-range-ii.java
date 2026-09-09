class Solution {
    public long countCommas(long n) {
        if (n < 1000) {
            return 0;
        }
        long t = 1000;
        long a = 0;
        while (n >= t) {
            a += n - t + 1;
            t *= 1000;
        }
        return a;
    }
}