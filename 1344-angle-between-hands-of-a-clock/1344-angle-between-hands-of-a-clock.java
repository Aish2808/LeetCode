class Solution {
    public double angleClock(int hour, int minutes) {
        double hourAngle = (hour % 12) * 30 + (minutes * 0.5);
        double minAngle = minutes * 6;
        double diff = Math.abs(hourAngle - minAngle);
        diff = Math.min(diff, 360 - diff);
        return diff; 
    }
}