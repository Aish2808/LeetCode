class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        int res[] = new int[friends.length];
        int n = 0;
        for (int i : friends) {
            set.add(i);
        }
        for (int i = 0; i < order.length; i++) {
            if (set.contains(order[i])) {
                res[n] = order[i];
                n++;
            }
        }
        return res;
    }
}