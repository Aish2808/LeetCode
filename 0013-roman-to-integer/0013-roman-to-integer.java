class Solution {
    public int romanToInt(String s) {
        int totalInt = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            switch(ch){
                case 'I':
                    if(i + 1 < s.length() && s.charAt(i + 1) == 'V'){
                        totalInt += 4;
                        i++; 
                    } else if(i + 1 < s.length() && s.charAt(i + 1) == 'X'){
                        totalInt += 9;
                        i++;
                    } 
                    else {
                        totalInt += 1;
                    }
                    break;
                case 'X':
                    if(i + 1 < s.length() && s.charAt(i + 1) == 'L'){
                        totalInt += 40;
                        i++;
                    } else if(i + 1 < s.length() && s.charAt(i + 1) == 'C'){
                        totalInt += 90;
                        i++;
                    } else {
                        totalInt += 10;
                    }
                    break;
                case 'C': 
                if(i + 1 < s.length() && s.charAt(i + 1) == 'D'){
                        totalInt += 400;
                        i++;
                    } else if(i + 1 < s.length() && s.charAt(i + 1)  == 'M'){
                        totalInt += 900;
                        i++;
                    } else {
                        totalInt += 100;
                    }
                    break;
                case 'V':
                    totalInt += 5;
                    break;
                case 'L':
                   totalInt += 50;
                    break;
                case 'D':
                    totalInt += 500;
                    break;
                case 'M':
                    totalInt += 1000;
                    break;

            }
        }
        return totalInt;
    }
}