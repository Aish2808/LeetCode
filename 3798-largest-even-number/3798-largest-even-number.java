class Solution {
    public String largestEven(String s) {
        if (s.charAt(s.length() - 1) == '2') {
            return s;
        } else {
            int r = s.length() - 1;
            while (r >= 0 && s.charAt(r) != '2') {
                r--;
            }
            if (r != -1) {
                return s.substring(0, r + 1);
            }
        }
        return "";
    }
}