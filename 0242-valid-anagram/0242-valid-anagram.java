class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        int n = a.length;
        int m = b.length;
        if(n != m){
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}