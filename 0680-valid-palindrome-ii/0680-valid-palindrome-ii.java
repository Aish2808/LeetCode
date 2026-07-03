class Solution {
    public boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            char ch1 = s.charAt(l);
            char ch2 = s.charAt(r);
            if (ch1 != ch2) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        int skip = 1;
        while (l < r) {
            char ch1 = s.charAt(l);
            char ch2 = s.charAt(r);
            if (ch1 != ch2) {
                return isPalindrome(s, l + 1, r) || isPalindrome(s, l, r - 1);
            }
            l++;
            r--;
        }
        return true;
    }
}