package kyu_6.tank_truck.java;

public class VolTank {
    public static int tankVol(int h, int d, int vt) {
        double pi = Math.acos(-1);
        double length = (double) (4 * vt) / (Math.pow(d, 2) * pi);
        double result = 0;
        if (2 * h <= d) {
            double theta = Math.acos((double) (d - 2 * h) / d);
            double sMax = 0.25 * Math.pow(d, 2) * theta;
            double sMin = 0.125 * Math.pow(d, 2) * Math.sin(2 * theta);
            result = (sMax - sMin) * length;
        } else {
            double theta = Math.acos((double) (2 * h - d) / d);
            double sMax = 0.25 * Math.pow(d, 2) * theta;
            double sMin = 0.125 * Math.pow(d, 2) * Math.sin(2 * theta);
            result = vt - (sMax - sMin) * length;
        }
        return (int) result;
    }
}
