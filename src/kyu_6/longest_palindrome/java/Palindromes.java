package kyu_6.longest_palindrome.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Palindromes {
    public static int longestPalindrome(final String s) {
        if (s.isEmpty()) {
            return 0;
        }
        List<String> result = new ArrayList<>();
        for (float pivot = 0; pivot < s.length(); pivot += .5) {
            float palindromeRadius = pivot - (int) pivot;
            while ((pivot + palindromeRadius) < s.length()
                    && (pivot - palindromeRadius) >= 0
                    && s.charAt((int) (pivot - palindromeRadius))
                    == s.charAt((int) (pivot + palindromeRadius))) {
                result.add(s.substring((int) (pivot - palindromeRadius),
                        (int) (pivot + palindromeRadius + 1)));
                palindromeRadius++;
            }
        }
        result.sort(Comparator.comparingInt(String::length));
        return result.get(result.size() - 1).length();
    }
}
