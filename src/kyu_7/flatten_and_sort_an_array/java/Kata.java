package kyu_7.flatten_and_sort_an_array.java;


import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kata {

    public static int[] flattenAndSort(int[][] array) {
        return Arrays.stream(Stream.of(array)
                .flatMapToInt(IntStream::of)
                .toArray()).sorted().toArray();
    }
}
