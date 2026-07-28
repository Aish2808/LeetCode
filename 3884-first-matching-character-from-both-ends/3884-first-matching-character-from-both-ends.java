class Solution {
    public int firstMatchingIndex(String s) {
        int n = s.length();
        for (int i = 0; i <= n / 2; i++) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(n - i - 1);
            if (ch1 == ch2) {
                return i;
            }
        }
        return -1;
    }
}