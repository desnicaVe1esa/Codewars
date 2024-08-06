package kyu_7.jumping_number_special_numbers_series_4.java;

public class Solution {
    public static String jumpingNumber(int number) {
        if (number <= 9) {
            return "Jumping!!";
        }
        String digits = String.valueOf(number);
        for (int i = 0; i < digits.length(); i++) {
            if (i < digits.length() - 1) {
                if (Math.abs(digits.charAt(i) - digits.charAt(i + 1)) != 1) {
                    return "Not!!";
                }
            }
        }
        return "Jumping!!";
    }
}
