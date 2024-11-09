package kyu_6._plus_1_array.java;

import java.math.BigInteger;
import java.util.Arrays;

import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.of;

public class PlusOneArray {
    public static int[] upArray(final int[] arr) {
        if (arr == null
                || arr.length == 0
                || Arrays.stream(arr).mapToObj(Integer::toString).collect(joining()).length() != arr.length) {
            return null;
        }
        return new BigInteger(of(arr).mapToObj(n -> n + "").collect(joining()))
                .add(BigInteger.ONE).toString().chars().map(c -> c - '0').toArray();
    }
}
