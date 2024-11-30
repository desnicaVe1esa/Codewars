package kyu_7.simple_remove_duplicates.java;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public static int[] solve(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int finalI = i;
            boolean contains = IntStream.of(result).anyMatch(x -> x == arr[finalI]);
            if (!contains) {
                result[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(Arrays.stream(result).filter(f -> f != 0).toArray()));
        return Arrays.stream(result).filter(f -> f != 0).toArray();
    }
}
