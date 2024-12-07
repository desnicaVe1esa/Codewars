package kyu_7.find_count_of_most_frequent_item_in_an_array.java;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static int mostFrequentItemCount(int[] collection) {
        if (collection.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : collection) {
            int count = map.getOrDefault(j, 0);
            map.put(j, count + 1);
        }
        return map.values().stream().max(Integer::compareTo).get();
    }
}
