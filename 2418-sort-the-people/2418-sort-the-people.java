class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length; i++) {
            int k = i;
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[k] < heights[j]) {
                    k = j;
                }
            }
            String temp = names[i];
            names[i] = names[k];
            names[k] = temp;
            int t = heights[i];
            heights[i] = heights[k];
            heights[k] = t;
        }
        return names;
    }
}