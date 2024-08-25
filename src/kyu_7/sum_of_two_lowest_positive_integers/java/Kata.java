package kyu_7.sum_of_two_lowest_positive_integers.java;

import java.util.Arrays;

class Kata{
    public static long sumTwoSmallestNumbers(final long [] numbers) {
        Arrays.sort(numbers);
        return numbers[0] + numbers[1];
    }
}