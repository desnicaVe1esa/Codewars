package kyu_8.removing_elements.java;

import java.util.Arrays;
import java.util.Objects;

public class Kata {

    public static Object[] removeEveryOther(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = null;
            }
        }
        return Arrays.stream(arr).filter(Objects::nonNull).toArray();
    }
}