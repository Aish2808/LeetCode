class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int s = 0;
        int c = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            int t = Math.min(boxTypes[i][0], truckSize - c);
            s += t * boxTypes[i][1];
            c += t;
            if (c == truckSize) {
                break;
            }
        }
        return s;
    }
}