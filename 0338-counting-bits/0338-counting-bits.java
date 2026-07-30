class Solution {
    public int[] countBits(int n) {
        int a[] = new int[n + 1];
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i / 2] + (i % 2);
        }
        return a;
    }
}