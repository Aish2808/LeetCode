class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int x = n;
        while (x > 0) {
            int l = x % 10;
            sum += l;
            product *= l;
            x /= 10;
        }
        int s = sum + product;
        if (n % s == 0) {
            return true;
        }
        return false;
    }
}