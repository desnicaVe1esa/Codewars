package kyu_8.find_numbers_which_are_divisible_by_given_number.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> result = new ArrayList<>();
        Arrays.stream(numbers).forEach(f -> {
            if(f % divider == 0) {
                result.add(f);
            }
        });
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}