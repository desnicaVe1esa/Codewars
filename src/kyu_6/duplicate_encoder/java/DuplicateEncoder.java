package kyu_6.duplicate_encoder.java;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    static String encode(String word) {
        String s = word.toLowerCase();
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int cnt = map.get(c);
                map.put(c, ++cnt);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                if (map.get(c) > 1) {
                    result.append(")");
                } else {
                    result.append("(");
                }
            }
        }
        return result.toString();
    }
}
