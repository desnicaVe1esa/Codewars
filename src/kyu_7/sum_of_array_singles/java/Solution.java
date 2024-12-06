package kyu_7.sum_of_array_singles.java;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int repeats(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            int count = 1;
            if (!map.containsKey(j)) {
                map.put(j, count);
            } else {
                map.put(j, count + 1);
            }
        }
        return map
                .keySet()
                .stream()
                .filter(f -> map.get(f) == 1)
                .reduce(Integer::sum).get();
    }
}
