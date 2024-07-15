package kyu_8.miles_per_gallon_to_kilometers_per_liter.java;


public class Converter {
    public static float mpgToKPM(final float mpg) {
        return Float.parseFloat(String.format("%.2f", mpg / 4.54609188f * 1.609344f));
    }
}