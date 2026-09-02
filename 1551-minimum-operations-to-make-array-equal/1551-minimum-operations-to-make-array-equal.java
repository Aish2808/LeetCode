class Solution {
    public int minOperations(int n) {
        int a[] = new int[n];
        int min = 0;
        for (int i = 0; i < n / 2; i++) {
            a[i] = (2 * i) + 1;
            min += n - a[i];
        }
        return min;
    }
}