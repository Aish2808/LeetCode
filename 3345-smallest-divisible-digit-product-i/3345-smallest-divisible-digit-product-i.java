class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int a = n;
            int p = 1;
            while(a > 0){
                int l = a % 10;
                p *= l;
                a /= 10;
            }
            if(p % t == 0){
                return n;
            }
            n++;
        }
    }
}