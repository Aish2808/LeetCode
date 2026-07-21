class Solution {
    public int countDigits(int num) {
        int c = 0;
        if (num < 9) {
            return 1;
        }
        int n = num;
        while (n > 0) {
            int l = n % 10;
            if (num % l == 0) {
                c++;
            }
            n = n / 10;
        }
        return c;
    }
}