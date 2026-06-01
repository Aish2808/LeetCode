class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        } else {
            int num = x;
            long rev = 0;
            while(x > 0){
                int last = x % 10;
                rev = (rev * 10) + last;
                x = x / 10;
            }

            if(rev == num) {
                return true; 
            }   
        }
        return false;
    }
}