package kyu_7.are_the_numbers_in_order.java;

import java.util.Arrays;

public class Solution {

    public static boolean isAscOrder(int[] arr) {
        int[] sortArr = arr.clone();
        Arrays.sort(sortArr);
        return Arrays.equals(arr, sortArr);
    }
}

