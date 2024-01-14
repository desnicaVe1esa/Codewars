package kyu_8.invert_values.java;

import java.util.Arrays;

public class Kata {
    public static int[] invert(int[] array) {
        return Arrays.stream(array)
                .map(n -> -n)
                .toArray();
    }
}
