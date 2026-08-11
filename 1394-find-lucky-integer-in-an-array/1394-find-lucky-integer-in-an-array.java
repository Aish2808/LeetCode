class Solution {
    public int findLucky(int[] arr) {
        int a[] = new int[501];
        for (int i = 0; i < arr.length; i++) {
            a[arr[i]]++;
        }
        int b[] = new int[501];
        for (int i = 0; i < a.length; i++) {
            if (i == a[i]) {
                b[i] = i;
            }
        }
        int m = 0;
        for (int i = 0; i < b.length; i++) {
            m = Math.max(m, b[i]);
        }
        if (m == 0) {
            return -1;
        }
        return m;
    }
}