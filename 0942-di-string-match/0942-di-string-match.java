class Solution {
    public int[] diStringMatch(String s) {
        int l = 0;
        int h = s.length();
        int a[] = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                a[i] = l;
                l++;
            } else {
                a[i] = h;
                h--;
            }
        }
        a[s.length()] = l;
        return a;
    }
}