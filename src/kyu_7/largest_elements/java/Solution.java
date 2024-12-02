package kyu_7.largest_elements.java;

import java.util.Arrays;

public class Solution {

    public static int[] largest(int n, int[] arr) {
        if (n == 0) {
            return new int[]{};
        }
        Arrays.sort(arr);
        return Arrays.stream(arr, arr.length - n, arr.length).toArray();
    }
}