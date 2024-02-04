package kyu_6.sum_of_digits_digital_root.java;

import java.util.ArrayList;
import java.util.List;

public class DRoot {
    public static int digital_root(int n) {
        if (n == 0) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(0, n % 10);
            n = n / 10;
        }
        int result = list.stream().reduce(Integer::sum).get();
        if (result >= 10) {
            return digital_root(result);
        }
        return result;
    }
}