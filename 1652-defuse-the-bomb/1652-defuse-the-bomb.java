class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int a[] = new int[n];
        if (k == 0) {
            return a;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= Math.abs(k); j++) {
                if (k > 0) {
                    a[i] += code[(i + j) % n];
                } else {
                    a[i] += code[(i - j + n) % n];
                }
            }
        }
        return a;
    }
}