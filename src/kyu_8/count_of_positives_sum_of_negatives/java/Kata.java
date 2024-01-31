package kyu_8.count_of_positives_sum_of_negatives.java;

import java.util.Arrays;

public class Kata {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }
        int[] result = new int[2];
        result[0] = (int) Arrays.stream(input).filter(f -> f > 0).count();
        result[1] = Arrays.stream(input).filter(f -> f < 0).sum();
        return result;
    }
}
