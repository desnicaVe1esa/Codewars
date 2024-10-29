package kyu_6.difference_of_2.java;

import java.util.Arrays;
import java.util.Objects;

public class Kata {
    public static int[][] twosDifference(int[] array) {
        int[][] result = new int[array.length][];
        Arrays.sort(array);
        for (int i = 0, j = 0; i < array.length; i++) {
            int num = calculate(array[i], array);
            if (num > 0) {
                result[j] = new int[]{array[i], num};
                j++;
            }
        }
        return removeNullFromResult(result);
    }

    public static int calculate(int num, int[] arr) {
        int result = 0;
        for (int j : arr) {
            if (j - num == 2) {
                result = j;
            }
        }
        return result;
    }

    public static int[][] removeNullFromResult(int[][] result) {
        long length = Arrays.stream(result).filter(Objects::nonNull).count();
        int[][] finalResult = new int[(int) length][];
        System.arraycopy(result, 0, finalResult, 0, finalResult.length);
        return finalResult;
    }
}