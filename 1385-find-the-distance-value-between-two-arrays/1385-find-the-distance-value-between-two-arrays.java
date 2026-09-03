class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int c = 0;
        for (int i : arr1) {
            int s = i - d;
            int l = i + d;
            int left = 0;
            int right = arr2.length;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (arr2[mid] < s) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            if (left == arr2.length || arr2[left] > l) {
                c++;
            }
        }
        return c;
    }
}