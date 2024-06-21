package kyu_8.grasshopper_debug.java;

public class GrassHopper {

    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c > 0) {
            return (c + " is above freezing temperature");
        } else {
            return (c + " is freezing temperature");
        }
    }

    public static double convertToCelsius(int temperature) {
        return (temperature - 32) * (5 / 9.0);
    }
}