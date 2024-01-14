package kyu_6.find_the_parity_outlier.java;

import java.util.Arrays;

public class FindOutlier {
    static int find(int[] integers) {
        int evenCounter = 0;
        int oddCounter = 0;
        int result = 0;
        for (int i : integers) {
            int check = i % 2 == 0 ? evenCounter++ : oddCounter++;
        }
        if (evenCounter < oddCounter) {
            for (int i : integers) {
                if (i % 2 == 0) {
                    result = i;
                }
            }
        } else {
            for (int i : integers) {
                if (i % 2 != 0) {
                    result = i;
                }
            }
        }
        return result;
    }
}
