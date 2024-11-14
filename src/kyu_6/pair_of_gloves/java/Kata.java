package kyu_6.pair_of_gloves.java;

import java.util.*;

class Kata {
    public static int numberOfPairs(String[] gloves) {
        List<Integer> pairs = new ArrayList<>(fillPairs(gloves).values());
        int pairsCount = 0;
        for (int pair : pairs) {
            while (pair > 0) {
                pairsCount++;
                pair /= 2;

            }
        }
        return pairsCount;
    }

    public static Map<String, Integer> fillPairs(String[] gloves) {
        Map<String, Integer> result = new HashMap<>();
        for (String glove : gloves) {
            int pair = result.getOrDefault(glove, 0);
            result.put(glove, pair + 1);
        }
        return result;
    }
}
