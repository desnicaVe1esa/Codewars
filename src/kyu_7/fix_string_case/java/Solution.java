package kyu_7.fix_string_case.java;

public class Solution {
    public static String solve(final String str) {
        int lower = str.replaceAll("[A-Z]", "").length();
        int upper = str.replaceAll("[a-z]", "").length();
        return lower >= upper ? str.toLowerCase() : str.toUpperCase();
    }
}