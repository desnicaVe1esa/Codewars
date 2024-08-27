package kyu_7.digits_explosion.java;

public class Solution {
    public static String explode(String digits) {
        String[] digitsArr = digits.split("");
        StringBuilder result = new StringBuilder();
        for (String s : digitsArr) {
            result.append(s.repeat(Integer.parseInt(s)));
        }
        return result.toString();
    }
}