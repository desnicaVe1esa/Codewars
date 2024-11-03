package kyu_7.balanced_number_special_numbers_series_1.java;

public class Solution {
    public static String balancedNum(long number) {
        int sumLeft = 0;
        int sumRight = 0;
        String numToStr = String.valueOf(number);
        int length = numToStr.length() % 2 == 0 ? numToStr.length() / 2 - 1 : numToStr.length() / 2;
        for (int i = 0, j = numToStr.length() - 1; i < length; i++, j--) {
            sumLeft += Integer.parseInt(numToStr.charAt(i) + "");
            sumRight += Integer.parseInt(numToStr.charAt(j) + "");
        }
        return sumLeft == sumRight ? "Balanced" : "Not Balanced";
    }
}