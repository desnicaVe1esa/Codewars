package kyu_6.length_of_missing_array.java;

import java.util.Arrays;

public class Kata {
    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        if (arrayOfArrays == null || arrayOfArrays.length == 0) return 0;
        for (Object[] a : arrayOfArrays) if (a == null || a.length == 0) return 0;

        return 1 + Arrays.stream(arrayOfArrays)
                .mapToInt(a -> a.length)
                .sorted()
                .reduce((a, b) -> (a + 1 == b) ? b : a)
                .getAsInt();
    }
}