class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '*':
                    if (result.length() > 0) {
                        result.deleteCharAt(result.length() - 1);
                    }
                    break;
                case '#':
                    result.append(result);
                    break;
                case '%':
                    result.reverse();
                    break;
                default:
                    result.append(ch);
            }
        }
        return result.toString();
    }
}