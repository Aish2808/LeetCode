class Solution {
    public int earliestTime(int[][] tasks) {
        int t = Integer.MAX_VALUE;
        for (int i = 0; i < tasks.length; i++) {
            int s = 0;
            for (int j = 0; j < tasks[0].length; j++) {
                s += tasks[i][j];
            }
            if (t > s) {
                t = s;
            }
        }
        return t;
    }
}