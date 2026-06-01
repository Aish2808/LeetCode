class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int n = 0;
        int m = 0;
        while(n < g.length && m < s.length){
            if(s[m] >= g[n]){
                count++;
                n++;
                m++;
            } else {
                m++;
            }
        }
        return count;
    }
}