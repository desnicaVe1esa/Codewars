package kyu_8.multiple_of_index.java;

import java.util.Arrays;

public class ZywOo {
    public static int[] multipleOfIndex(int[] array) {
        int[] result = new int[array.length];
        Arrays.fill(result, -999999999);
        for (int i = 1; i < array.length; i++) {
            if (array[0] == 0) {
                result[0] = 0;
            }
            if (array[i] % i == 0) {
                result[i] = array[i];
            }
        }
        return Arrays.stream(result).filter(f -> f != -999999999).toArray();
    }
}