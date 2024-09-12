package kyu_7.sort_out_the_men_from_boys.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Kata {
    public static int[] menFromBoys(final int[] values) {
        int[] odds = Arrays.stream(values).filter(f -> f % 2 != 0)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .distinct()
                .toArray();
        int[] evens = Arrays.stream(values).filter(f -> f % 2 == 0)
                .boxed()
                .sorted()
                .mapToInt(Integer::intValue)
                .distinct()
                .toArray();
        return IntStream.concat(Arrays.stream(evens), Arrays.stream(odds))
                .toArray();
    }
}
