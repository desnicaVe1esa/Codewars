package kyu_8.a_needle_in_the_haystack.java;

import java.util.Arrays;

public class Kata {
    public static String findNeedle(Object[] haystack) {
        int position = Arrays.stream(haystack).toList().indexOf("needle");
        return "found the needle at position " + position;
    }
}