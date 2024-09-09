package kyu_7.character_counter.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharacterCounter {

    public static boolean validateWord(String word) {
        Map<Character, Integer> prepared = new HashMap<>();
        char[] chars = word.toLowerCase().toCharArray();
        for (char c : chars) {
            if (!prepared.containsKey(c)) {
                prepared.put(c, 1);
            } else {
                prepared.put(c, prepared.get(c) + 1);
            }
        }
        Set<Integer> result = new HashSet<>();
        for (Map.Entry<Character, Integer> map : prepared.entrySet()) {
            result.add(map.getValue());
        }
        return result.size() == 1;
    }
}
