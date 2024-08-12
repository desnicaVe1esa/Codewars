package kyu_7.sum_of_cubes.java;

public class Solution {
    public static long sumCubes(long n) {
        long result = 0;
        for (long i = 1; i <= n; i++) {
            result += i * i * i;
        }
        return result;
    }
}