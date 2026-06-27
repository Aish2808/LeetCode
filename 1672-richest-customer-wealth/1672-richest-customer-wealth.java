class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int cus = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                cus += accounts[i][j];
            }
            if (cus > max) {
                max = cus;
            }
        }
        return max;
    }
}