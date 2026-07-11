class Solution {
    public int differenceOfSums(int n, int m) {
        int dc = 0;
        int ndc = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                dc += i;
            } else {
                ndc += i;
            }
        }
        return ndc - dc;
    }
}