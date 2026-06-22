class Solution {
    public int maxNumberOfBalloons(String text) {
        int arr[] = new int[26];
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(ch == 'b' || ch == 'a' || ch == 'l' || ch =='o' || ch == 'n'){
                arr[ch - 'a']++;
            } 
        }
        int a = arr[0];
        int b = arr[1];
        int l = arr[11] / 2;
        int o = arr[14] / 2;
        int n = arr[13];
        return Math.min(n, Math.min(o, Math.min(l, Math.min(b, a))));
    }
}