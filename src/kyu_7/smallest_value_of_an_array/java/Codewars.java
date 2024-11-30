package kyu_7.smallest_value_of_an_array.java;

import java.util.Arrays;

public class Codewars {
    public static int findSmallest(int[] numbers, String mode) {
        int min = Arrays.stream(numbers).min().getAsInt();
        int idxMin = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min) {
                idxMin = i;
                break;
            }
        }
        return mode.equals("value") ? min : idxMin;
    }
}
