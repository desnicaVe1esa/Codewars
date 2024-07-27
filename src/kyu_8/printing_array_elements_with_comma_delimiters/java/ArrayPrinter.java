package kyu_8.printing_array_elements_with_comma_delimiters.java;

import java.util.Arrays;

public class ArrayPrinter {

    public static String printArray(Object[] array) {
        StringBuilder result = new StringBuilder();
        Arrays.stream(array).forEach(f -> {
            result.append(f).append(",");
        });
        return result.substring(0, result.length() - 1);
    }
}