package kyu_6.simple_frequency_sort.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public static int[] sortByFrequency(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        Map<Integer, Long> freq = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        list.sort((a, b) -> {
            if (Objects.equals(freq.get(a), freq.get(b))) {
                return a - b;
            }
            return (int) (freq.get(b) - freq.get(a));
        });

        return list.stream().mapToInt(i -> i).toArray();
    }
}
