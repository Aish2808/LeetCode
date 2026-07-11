class Solution {
    public double[] convertTemperature(double celsius) {
        double k = celsius + 273.15;
        double f = celsius * 1.80 + 32.00;
        double[] r = new double[2];
        r[0] = k;
        r[1] = f;
        return r;
    }
}