class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int a[] = new int[arr.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[i];
        }
        Arrays.sort(a);
        HashMap<Integer, Integer> hm = new HashMap<>();
        int pv = 0;
        int r = 1;
        for (int i = 0; i < a.length; i++) {
            int cv = a[i];
            if (i == 0 || cv != pv) {
                hm.put(cv, r);
                r++;
            }
            pv = cv;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = hm.get(arr[i]);
        }
        return arr;
    }
}