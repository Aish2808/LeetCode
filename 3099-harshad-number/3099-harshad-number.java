class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int a = x;
        int r = 0;
        while (a > 0) {
            int l = a % 10;
            r += l;
            a /= 10;
        }
        if (x % r == 0) {
            return r;
        }
        return -1;
    }
}