class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sum = new StringBuilder();
        int n = num1.length() - 1;
        int m = num2.length() - 1;
        char arr1[] = num1.toCharArray();
        char arr2[] = num2.toCharArray();
        int Carry = 0;
        while (n >= 0 || m >= 0 || Carry != 0) {
            int digit1 = 0;
            int digit2 = 0;
            if(n >=0){
                digit1 = arr1[n] - '0';
            }
            if(m >=0){
                digit2 = arr2[m] - '0';
            }
            int s1 = digit1 + digit2 + Carry;
            Carry = s1 / 10;
            sum.append(s1 % 10);
            n--;
            m--;
        }
        return sum.reverse().toString();
    }
}