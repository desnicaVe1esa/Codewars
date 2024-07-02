package kyu_7.simple_string_reversal.java;

import java.util.stream.IntStream;

class Solution {
    public static String solve(String s) {
        StringBuilder str = new StringBuilder(s.replaceAll(" ", "")).reverse();
        IntStream.range(0, s.length())
                .filter(i -> s.charAt(i) == ' ')
                .forEach(j -> str.insert(j, ' '));
        return str.toString();
    }
}