package kyu_8.find_the_first_non_consecutive_number.java;

import java.util.Arrays;

public class FirstNonConsecutive {
    static Integer find(final int[] array) {
        for (int i = 1; i < array.length; i++) {
            int a = array[i] - array[i-1];
            if (a >= 2) {
                return array[i];
            }
        }
        return null;
    }
}
