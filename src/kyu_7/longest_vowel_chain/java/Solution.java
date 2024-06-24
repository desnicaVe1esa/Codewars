package kyu_7.longest_vowel_chain.java;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public static int solve(String s) {
        return Arrays.stream(s.split("[^aeiou]")).max(Comparator.comparing(String::length)).get().length();
    }
}