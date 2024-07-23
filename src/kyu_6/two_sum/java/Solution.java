package kyu_6.two_sum.java;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    if (numbers[i] + numbers[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[]{0, 0};
    }
}
