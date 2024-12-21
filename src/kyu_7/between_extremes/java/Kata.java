package kyu_7.between_extremes.java;

import java.util.Arrays;

public class Kata {
    public static int betweenExtremes(int[] numbers) {
        return Arrays.stream(numbers).max().getAsInt() - Arrays.stream(numbers).min().getAsInt();
    }
}
