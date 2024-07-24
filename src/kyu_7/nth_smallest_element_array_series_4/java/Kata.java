package kyu_7.nth_smallest_element_array_series_4.java;

import java.util.Arrays;

public class Kata {
    public static int nthSmallest(final int[] arr, final int n) {
        return Arrays.stream(arr).sorted().toArray()[n - 1];
    }
}
