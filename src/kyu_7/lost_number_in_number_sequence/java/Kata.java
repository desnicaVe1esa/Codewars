package kyu_7.lost_number_in_number_sequence.java;

import java.util.Arrays;

public class Kata {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        if (arr.length == 0 && mixedArr.length == 0) {
            return 0;
        }
        return Arrays.stream(arr).sum() - Arrays.stream(mixedArr).sum();
    }
}