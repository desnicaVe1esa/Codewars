package kyu_8.smallest_unused_id.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Kata {
    public static int nextId(int[] ids) {
        Arrays.sort(ids);
        if (
                Arrays.stream(ids).filter(f -> f == 0).toArray().length == 0
        ) {
            return 0;
        }
        List<Integer> compareList = new ArrayList<>();
        for (int i = 0; i < ids.length; i++) {
            if (i < ids.length - 1) {
                if (Math.abs(ids[i + 1] - ids[i]) > 1) {
                    compareList.add(ids[i]);
                    compareList.add(ids[i + 1]);
                    break;
                }
            }
            if (i == ids.length - 1) {
                return ids[i] + 1;
            }
        }
        return compareList.stream().min(Comparator.comparing(c -> c)).get() + 1;
    }
}
