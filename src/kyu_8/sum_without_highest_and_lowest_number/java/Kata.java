package kyu_8.sum_without_highest_and_lowest_number.java;

public class Kata {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length <= 2) {
            return 0;
        }

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            sum += number;

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        return sum - max - min;
    }
}