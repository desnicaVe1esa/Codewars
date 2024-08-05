package kyu_7.minimize_sum_of_array_array_series_number_1.java;

import java.util.Arrays;

public class Solution {
    public static int minSum(int[] passed) {
        int result = 0;
        Arrays.sort(passed);
        for (int i = 0, j = passed.length - 1; i < passed.length; i += 2, j -= 2) {
            result += passed[j] * passed[i];
        }
        return result;
    }
}