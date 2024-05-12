package kyu_8.enumerable_magic_number_25_take_the_first_n_elements.java;

import java.util.Arrays;

public class ZywOo {
    public static int[] take(int[] arr, int n) {
        return n > arr.length ? arr : Arrays.copyOf(arr, n);
    }
}