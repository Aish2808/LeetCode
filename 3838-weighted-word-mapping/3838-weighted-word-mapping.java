class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<words.length;i++){
            String st = words[i];
            int totalWeights = 0;
            for(int j=0;j<st.length();j++){
                char ch = st.charAt(j);
                totalWeights += weights[ch - 'a'];
            }
            int weight = totalWeights % 26;
            char ch1 = (char)('z' - weight);
            str.append(ch1);
        }
        return str.toString();
    }
}