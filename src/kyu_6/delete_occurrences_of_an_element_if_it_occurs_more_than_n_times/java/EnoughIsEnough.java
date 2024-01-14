package kyu_6.delete_occurrences_of_an_element_if_it_occurs_more_than_n_times.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> map = new HashMap<>();
        return Arrays.stream(elements).filter(f -> map.merge(f, 1, Integer::sum) <= maxOccurrences).toArray();
    }
}
