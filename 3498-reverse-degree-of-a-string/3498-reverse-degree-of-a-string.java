class Solution {
    public int reverseDegree(String s) {
        int c = 1;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int pos = s.charAt(i) - 'a' + 1;
            int reverse = 27 - pos;
            sum += reverse * c;
            c++;
        }
        return sum;
    }
}