class Solution {
    public int minimumFlips(int n) {
        String s = Integer.toBinaryString(n);
        int l = 0;
        int r = s.length() - 1;
        int c = 0;
        while (l < r) {
            int a = s.charAt(l);
            int b = s.charAt(r);
            if (a != b) {
                c += 2;
            }
            l++;
            r--;
        }
        return c;
    }
}