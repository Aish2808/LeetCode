class Solution {
    public boolean squareIsWhite(String coordinates) {
        char ch = coordinates.charAt(0);
        if (ch == 'a' || ch == 'c' || ch == 'e' || ch == 'g') {
            int n = coordinates.charAt(1) - '0';
            if (n % 2 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            int n = coordinates.charAt(1) - '0';
            if (n % 2 != 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}