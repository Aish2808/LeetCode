class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int m1 = n * n;
        int m2 = maxWeight / w;
        return Math.min(m1, m2);
    }
}