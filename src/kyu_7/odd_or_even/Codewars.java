package kyu_7.odd_or_even;

// Определяет, является ли сумма чисел массива четной или нечетной

import static java.util.Arrays.stream;

public class Codewars {

    public static void main(String[] args) {
        int[] array = {0, 1, 4};
        System.out.println(oddOrEven(array));
    }

    public static String oddOrEven (int[] array) {
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}
