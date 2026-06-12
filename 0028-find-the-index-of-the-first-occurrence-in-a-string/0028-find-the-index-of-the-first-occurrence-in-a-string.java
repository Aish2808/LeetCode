class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length() - needle.length();
        int m = needle.length();
        for(int i=0;i<=n;i++){
            boolean match = true;
            for(int j=0;j<m;j++){
                char ch1 = haystack.charAt(i + j);
                char ch2 = needle.charAt(j);
                if(ch1 != ch2){
                    match = false;
                    break;
                }
            }
            if(match){
                return i;
            }
        }
        return -1;
    }
}