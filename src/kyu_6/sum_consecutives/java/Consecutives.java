package kyu_6.sum_consecutives.java;

import java.util.ArrayList;
import java.util.List;

public class Consecutives {

    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> result = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < s.size(); i++) {
            if (i < s.size() - 1) {
                while (s.get(i).equals(s.get(i + 1))) {
                    count++;
                    i++;
                }
            }
            result.add(s.get(i) * count);
            count = 1;
        }
        return result;
    }
}
