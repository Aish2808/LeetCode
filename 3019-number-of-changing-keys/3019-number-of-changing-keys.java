class Solution {
    public int countKeyChanges(String s) {
        s = s.toLowerCase();
        int c = 0;
        for (int i = 1; i < s.length(); i++) {
            char ch1 = s.charAt(i - 1);
            char ch2 = s.charAt(i);
            if (ch1 != ch2) {
                c++;
            }
        }
        return c;
    }
}