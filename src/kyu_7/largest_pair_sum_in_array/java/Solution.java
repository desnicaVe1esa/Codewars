package kyu_7.largest_pair_sum_in_array.java;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static int largestPairSum(int[] numbers) {
        AtomicInteger repeat = new AtomicInteger();
        int biggest = Arrays.stream(numbers).max().getAsInt();
        int big = Arrays.stream(numbers).filter(f -> f < Arrays.stream(numbers).max().getAsInt()).max().getAsInt();
        Arrays.stream(numbers).forEach(f -> {
            if (f == biggest) {
                repeat.getAndIncrement();
            }
        });
        return repeat.get() > 1 ? biggest * repeat.get() : biggest + big;
    }
}