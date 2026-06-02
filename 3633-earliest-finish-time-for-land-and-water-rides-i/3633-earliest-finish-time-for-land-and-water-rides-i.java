class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int MinLandFinish = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int landFinish = landStartTime[i] + landDuration[i];
            for (int j = 0; j < m; j++) {
                int waterStart = Math.max(landFinish, waterStartTime[j]);
                int Finish = waterStart + waterDuration[j];
                MinLandFinish = Math.min(MinLandFinish, Finish);
            }
        }
        int MinWaterFinish = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            int waterFinish = waterStartTime[j] + waterDuration[j];
            for (int i = 0; i < n; i++) {
                int landStart = Math.max(waterFinish, landStartTime[i]);
                int Finish = landStart + landDuration[i];
                MinWaterFinish = Math.min(MinWaterFinish, Finish);
            }
        }
        int MinFinish = Math.min(MinLandFinish, MinWaterFinish);
        return MinFinish;
    }
}