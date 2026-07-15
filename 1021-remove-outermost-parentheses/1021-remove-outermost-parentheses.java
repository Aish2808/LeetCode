class Solution {
    public String removeOuterParentheses(String s) {
        int d = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (d > 0) {
                    sb.append('(');
                }
                d++;
            } else {
                d--;
                if (d > 0) {
                    sb.append(')');
                }
            }
        }
        return sb.toString();
    }
}