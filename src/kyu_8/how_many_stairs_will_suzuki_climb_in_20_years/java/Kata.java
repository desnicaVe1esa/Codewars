package kyu_8.how_many_stairs_will_suzuki_climb_in_20_years.java;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kata {
    public static long stairsIn20(int[][] stairs) {
        return Arrays.stream(Stream.of(stairs)
                .flatMapToInt(IntStream::of)
                .toArray()).sum() * 20L;
    }
}