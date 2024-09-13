package kyu_7.trilingual_democracy.java;

import java.util.HashMap;
import java.util.Map;

public class TrilingualDemocracy {
    public static char trilingualDemocracy(char[] group) {
        final char[] att = new char[]{'D', 'F', 'I', 'K'};
        char result = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : group) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        if (map.size() == 2) {
            for (Map.Entry<Character, Integer> m : map.entrySet()) {
                if (m.getValue() == 1)
                    result = m.getKey();
            }
        }
        if (map.size() > 2) {
            for (char c : att) {
                if (!map.containsKey(c)) {
                    result = c;
                }
            }
        }
        return map.size() == 1 ? group[0] : result;
    }
}
