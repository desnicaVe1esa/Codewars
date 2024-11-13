package kyu_6.character_with_longest_consecutive_repetition.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    private static final Pattern PATTERN = Pattern.compile("(.)(\\1*)");

    public static Object[] longestRepetition(String s) {
        Object[] result = new Object[]{"", 0};
        Matcher matcher = PATTERN.matcher(s);
        while (matcher.find()) {
            if (matcher.group().length() > (int) result[1]) {
                result[0] = matcher.group().substring(0, 1);
                result[1] = matcher.group().length();
            }
        }
        return result;
    }
}
