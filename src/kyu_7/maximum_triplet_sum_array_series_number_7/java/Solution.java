package kyu_7.maximum_triplet_sum_array_series_number_7.java;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static int maxTriSum(int[] numbers) {
        List<Integer> integers = fillSet(numbers).stream().sorted().toList();
        int result = 0;
        for (int i = integers.size() - 1; i > integers.size() - 4; i--) {
            result += integers.get(i);
        }
        return result;
    }

    public static Set<Integer> fillSet(int[] numbers) {
        Set<Integer> result = new HashSet<>();
        for (int number : numbers) {
            result.add(number);
        }
        return result;
    }
}