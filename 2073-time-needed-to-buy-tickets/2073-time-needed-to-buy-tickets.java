class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int s = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                s += Math.min(tickets[i], tickets[k]);
            } else {
                s += Math.min(tickets[i], tickets[k] - 1);
            }
        }
        return s;
    }
}