package kyu_7.simple_consecutive_pairs.java;

class Solution {
    public static int solve(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (Math.abs(arr[i] - arr[i + 1]) == 1) {
                count++;
            }
        }
        return count;
    }
}
