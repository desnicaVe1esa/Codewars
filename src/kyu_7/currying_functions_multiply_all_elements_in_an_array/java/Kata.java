package kyu_7.currying_functions_multiply_all_elements_in_an_array.java;

import java.util.Arrays;
import java.util.function.Function;

public class Kata {
    public static Function<Integer, int[]> multiplyAll(int[] array) {
        return integer -> {
            return Arrays.stream(array).map(m -> m * integer).toArray();
        };
    }
}
