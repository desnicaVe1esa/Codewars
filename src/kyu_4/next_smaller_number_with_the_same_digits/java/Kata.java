package kyu_4.next_smaller_number_with_the_same_digits.java;

import java.util.Arrays;
import java.util.Comparator;

public class Kata {
    public static long nextSmaller(long n) {
        Long[] k = String.valueOf(n).chars().mapToLong(x -> x - 48).boxed().toArray(Long[]::new);
        for (int i = k.length - 2; i >= 0; i--) {
            for (int j = k.length - 1; j > i; j--) {
                if (k[i] > k[j]) {
                    k[i] ^= k[j];
                    k[j] ^= k[i];
                    k[i] ^= k[j];
                    Arrays.sort(k, i + 1, k.length, Comparator.reverseOrder());
                    return k[0] != 0 ? Arrays.stream(k).reduce((x, y) -> x * 10 + y).get() : -1;
                }
            }
        }
        return -1;
    }
}