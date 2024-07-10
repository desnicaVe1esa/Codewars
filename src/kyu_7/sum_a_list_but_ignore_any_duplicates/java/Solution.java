package kyu_7.sum_a_list_but_ignore_any_duplicates.java;

import java.util.*;

public class Solution{
    public static int sumNoDuplicates(int[] arr){
        if (arr.length == 0) {
            return 0;
        }

        Map<Integer, Integer> prepared = new HashMap<>();
        int count = 1;
        for (int j : arr) {
            if (prepared.containsKey(j)) {
                prepared.put(j, count + 1);
            } else {
                prepared.put(j, count);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i : prepared.keySet()) {
            if (prepared.get(i) == 1) {
                result.add(i);
            }
        }

        return result.stream().reduce(Integer::sum).orElse(0);
    }
}
