package kyu_5.josephus_permutation.java;

import java.util.ArrayList;
import java.util.List;

public class Josephus {

    public static <T> List<T> josephusPermutation (final List<T> items, final int k) {
        List<T> result = new ArrayList<>();
        boolean[] positions = new boolean[items.size()];
        int i = 1;
        int j = 0;

        while (result.size() < items.size()) {
            if (positions[j]) {
                j = j + 1 == items.size() ? 0 : ++j;
                continue;
            }

            if (!positions[j] && i % k == 0) {
                positions[j] = true;
                result.add(items.get(j));
            }

            i++;
            j = j + 1 == items.size() ? 0 : ++j;
        }

        return result;
    }
}