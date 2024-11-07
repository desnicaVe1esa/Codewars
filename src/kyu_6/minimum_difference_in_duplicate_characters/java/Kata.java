package kyu_6.minimum_difference_in_duplicate_characters.java;

import java.util.*;

public class Kata {
    public static Object[] minRepeatingCharacterDifference(String text) {
        Map<Character, Integer> map = new HashMap<>();
        Object[] result = null;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (map.containsKey(c)) {
                int diff = i - map.get(c);
                if (result == null || (result[0] != null && diff < (Integer) result[0])) {
                    result = new Object[]{diff, String.valueOf(c)};
                }
            }
            map.put(c, i);
        }
        return result;
    }
}