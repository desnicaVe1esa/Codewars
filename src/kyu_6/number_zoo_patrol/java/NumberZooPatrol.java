package kyu_6.number_zoo_patrol.java;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberZooPatrol {

    public static int findMissingNumber(int[] numbers) {
        return IntStream.rangeClosed(1, numbers.length + 1).sum() - Arrays.stream(numbers).sum();
    }
}
