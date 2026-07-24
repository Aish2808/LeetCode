class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int np[] = new int[n];
        for (int i = 0; i < n; i++) {
            int p1 = prices[i];
            int l = prices[i];
            for (int j = i + 1; j < n; j++) {
                int p2 = prices[j];
                if (p2 <= p1) {
                    l = Math.min(l, p1 - p2);
                    break;
                }
            }
            np[i] = l;
        }
        return np;
    }
}