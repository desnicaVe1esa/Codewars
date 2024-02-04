package kyu_8.what_is_between.java;

import java.util.ArrayList;
import java.util.List;

public class Kata {

    public static int[] between(int a, int b) {
        List<Integer> result = new ArrayList<>();
        for (; a <= b; a++) {
            result.add(a);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
