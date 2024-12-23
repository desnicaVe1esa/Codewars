package kyu_7.minimum_steps_array_series_6.java;

import java.util.Arrays;

public class Kata {
    public static int minimumSteps(int[] numbers, int k) {
        int steps = 0;
        Arrays.sort(numbers);
        int sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (sum == k) {
                break;
            }
            steps++;
            sum += numbers[i];
        }
        return steps;
    }
}
