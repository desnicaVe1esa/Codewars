package kyu_8.sum_arrays.java;

import java.util.Arrays;

public class SumArray {
    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
