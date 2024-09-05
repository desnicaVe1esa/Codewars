package kyu_7.max_diff_easy.java;

import java.util.Arrays;

public class Kata {

    public static int maxDiff(int[] lst) {
        if (lst.length <= 1) {
            return 0;
        } else {
            return Arrays.stream(lst).max().getAsInt() - Arrays.stream(lst).min().getAsInt();
        }
    }
}