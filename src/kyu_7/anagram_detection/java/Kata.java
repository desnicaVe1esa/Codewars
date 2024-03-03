package kyu_7.anagram_detection.java;

import java.util.Arrays;

public class Kata {
    public static boolean isAnagram(String test, String original) {
        char[] word1 = test.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] word2 = original.toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }
}