class Solution {
    // public boolean isPower(int n){
    //     if(n == 1){
    //         return true;
    //     } else if(n % 2 != 0 || n <= 0){
    //         return false;
    //     }
    //     return isPower(n/2);
    // }
    public boolean isPowerOfTwo(int n) {
        // return isPower(n);
        if(n <= 0){
            return false;
        } else if((n & (n - 1)) == 0){
            return true;
        }
        return false;
    }
}