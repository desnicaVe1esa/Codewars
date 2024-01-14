package kyu_6.array_diff.java;

import java.util.ArrayList;
import java.util.List;

public class Kata {

        public static int[] arrayDiff(int[] a, int[] b) {
            List<Integer> list = new ArrayList<>();
            for (int i : a) {
                boolean isB = false;
                for (int j : b) {
                    if (i == j) {
                        isB = true;
                        break;
                    }
                }
                if (!isB) {
                    list.add(i);
                }
            }
            int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            return result;
        }
}
