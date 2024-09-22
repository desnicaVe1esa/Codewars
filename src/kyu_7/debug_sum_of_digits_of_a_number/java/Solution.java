package kyu_7.debug_sum_of_digits_of_a_number.java;

public class Solution {
    public static int sumOfDigits(int n) {
        int sum = 0;
        String digits = n + "";
        for (int i = 0; i < digits.length(); i++) {
            sum += Integer.parseInt(digits.charAt(i) + "");
        }
        return sum;
    }
}
