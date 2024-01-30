package kyu_6.find_the_unique_number.java;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static double findUniq(double arr[]) {
        Map<Double, Integer> countMap = new HashMap<>();

        for (double num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0;
    }
}
