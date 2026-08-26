class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int l = 0;
        int r = 0;
        int c = Integer.MAX_VALUE;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            int n = 0;
            if (s.charAt(i) == '1') {
                n++;
                l = i;
                int a = i + 1;
                if (n == k) {
                    r = i;
                }
                while (n != k && a < s.length()) {
                    if (s.charAt(a) == '1') {
                        n++;
                    }
                    if (n == k) {
                        r = a;
                    }
                    a++;
                }
                if (n == k) {
                    String sub = s.substring(l, r + 1);
                    if (sub.length() < c || (sub.length() == c && sub.compareTo(res) < 0)) {
                        c = sub.length();
                        res = sub;
                    }
                }
            }
        }
        return res;
    }
}