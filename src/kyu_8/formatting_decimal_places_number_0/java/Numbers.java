package kyu_8.formatting_decimal_places_number_0.java;


public class Numbers {
    public static double TwoDecimalPlaces(double number) {
        number = Math.round(number * 100);
        return number / 100;
    }
}