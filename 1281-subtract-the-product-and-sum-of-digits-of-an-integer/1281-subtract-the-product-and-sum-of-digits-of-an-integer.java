class Solution {
    public int subtractProductAndSum(int n) {
        int p = 1;
        int s = 0;
        while (n > 0) {
            int l = n % 10;
            p = p * l;
            s = s + l;
            n = n / 10;
        }
        return p - s;
    }
}