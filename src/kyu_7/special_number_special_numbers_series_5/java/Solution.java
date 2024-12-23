package kyu_7.special_number_special_numbers_series_5.java;

public class Solution {
    public static String specialNumber(int number) {
        if(String.valueOf(number).replaceAll("[012345]", "").isEmpty()) {
            return "Special!!";
        } else {
            return "NOT!!";
        }
    }
}
