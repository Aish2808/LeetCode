class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();
        int n = a.length() - 1;
        int m = b.length() - 1;
        int carry = 0;
        while (m >= 0 || n >= 0 || carry != 0) {
            int first = 0;
            if (n >= 0) {
                first = a.charAt(n) - '0';
                n--;
            }
            int second = 0;
            if (m >= 0) {
                second = b.charAt(m) - '0';
                m--;
            }
            int total = first + second + carry;
            sum.append(total % 2);
            carry = total / 2;
        }
        return sum.reverse().toString();
    }
}