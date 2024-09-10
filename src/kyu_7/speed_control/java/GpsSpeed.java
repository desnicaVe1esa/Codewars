package kyu_7.speed_control.java;

public class GpsSpeed {

    public static int gps(int s, double[] x) {
        int result = 0;
        for (int i = 0; i < x.length; i++) {
            if (i < x.length - 1) {
                result = Math.max(result, (int) Math.floor(3600 * (x[i + 1] - x[i]) / s));
            }
        }
        return result;
    }
}
