package kyu_7.array_leaders_array_series_3.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<Integer> arrayLeaders(int[] numbers) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int[] sum = Arrays.copyOfRange(numbers, i + 1, numbers.length);
            if (numbers[i] > Arrays.stream(sum).sum()) {
                result.add(numbers[i]);
            }
        }
        return result;
    }
}