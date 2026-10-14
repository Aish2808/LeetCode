class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) {
            return "";
        }
        StringBuilder a = new StringBuilder();
        int n = sum / 9;
        int r = sum % 9;
        a.append("9".repeat(n));
        if (r > 0) {
            a.append(r);
        }
        a.append("0".repeat(num - a.length()));
        return a.toString();
    }
}