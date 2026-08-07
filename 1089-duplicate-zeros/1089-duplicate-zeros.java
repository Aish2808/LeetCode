class Solution {
    public void duplicateZeros(int[] arr) {
        int a[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length && j < a.length; i++) {
            a[j] = arr[i];
            j++;
            if (arr[i] == 0 && j < a.length) {
                a[j] = 0;
                j++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
    }
}