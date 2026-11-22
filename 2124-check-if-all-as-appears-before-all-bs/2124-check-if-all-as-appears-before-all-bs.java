class Solution {
    public boolean checkString(String s) {
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' && b != 0) {
                return false;
            }
            if (ch == 'b') {
                b++;
            }
        }
        return true;
    }
}