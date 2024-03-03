package kyu_8.convert_number_to_reversed_array_of_digits.java;

import java.util.Arrays;

public class Kata {
    public static int[] digitize(long n) {
        int[] num = Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        StringBuilder stringBuilder = new StringBuilder();
        return Arrays.stream(stringBuilder.append(Arrays.toString(num).replace("[", "")
                .replace("]", "")).reverse().toString().split(" ,"))
                .mapToInt(Integer::parseInt).toArray();
    }
}