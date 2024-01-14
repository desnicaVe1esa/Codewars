package kyu_6.detect_pangram.java;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public boolean check(String sentence) {
        int alphabet = 26;
        Set<Character> set = new HashSet<>();
        String[] arrStr = sentence.split(" ");
        for (String s : arrStr) {
            char[] chars = s.toLowerCase().replaceAll("[^a-z]", "").toCharArray();
            for (char c : chars) {
                set.add(c);
            }
        }
        return set.size() == alphabet;
    }
}