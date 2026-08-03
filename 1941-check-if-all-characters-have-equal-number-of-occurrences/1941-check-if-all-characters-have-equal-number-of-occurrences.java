class Solution {
    public boolean areOccurrencesEqual(String s) {
        int a[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
        }
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                n = a[i];
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0 && a[i] != n) {
                return false;
            }
        }
        return true;
    }
}