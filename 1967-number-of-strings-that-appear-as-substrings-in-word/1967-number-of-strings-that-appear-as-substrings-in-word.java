class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int sub = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) {
                sub++;
            }
        }
        return sub;
    }
}