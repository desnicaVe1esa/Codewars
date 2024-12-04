package kyu_7.extra_perfect_numbers_special_numbers_series_7.java;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int[] extraPerfect(int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            String s = toBinary(i);
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(m -> m).toArray();
    }

    public static String toBinary(int i) {
        StringBuilder result = new StringBuilder();
        while (i > 0) {
            result.append(i % 2);
            i /= 2;
        }
        return result.toString();
    }
}
