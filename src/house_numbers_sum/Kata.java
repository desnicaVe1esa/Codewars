package house_numbers_sum;

// Складывает все числа массива, пока в массиве не встретится ноль.

public class Kata {
    public static int houseNumbersSum(final int[] arr) {
        int sum = 0;
        for (int j : arr) {
            if (j == 0) break;
            sum += j;
        }
        return sum;
    }
}