class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int n = rectangles.length;
        int m = rectangles[0].length;
        int s[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (rectangles[i][0] < rectangles[i][1]) {
                s[i] = rectangles[i][0];
            } else {
                s[i] = rectangles[i][1];
            }
        }
        int max = 0;
        for (int i = 0; i < s.length; i++) {
            if (max < s[i]) {
                max = s[i];
            }
        }
        int c = 0;
        for (int i = 0; i < s.length; i++) {
            if (max == s[i]) {
                c++;
            }
        }
        return c;
    }
}