package kyu_7.simple_string_characters.java;

public class Kata {

    public static int[] Solve(String word) {
        int upperCase = word.replaceAll("[^A-Z]", "").length();
        int lowerCase = word.replaceAll("[^a-z]", "").length();
        int nums = word.replaceAll("[^0-9]", "").length();
        int symbols = word.length() - (upperCase + lowerCase + nums);
        return new int[]{upperCase, lowerCase, nums, symbols};
    }
}
