class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
        int c = 1;
        int j = 1;
        while (true) {
            if (!(s.contains(j))) {
                if (c == k) {
                    break;
                }
                c++;
            }
            j++;
        }
        return j;
    }
}