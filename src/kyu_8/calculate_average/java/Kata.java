package kyu_8.calculate_average.java;

import java.util.Arrays;

public class Kata {
    public static double find_average(int[] array) {
        return Arrays.stream(array).asDoubleStream().sum() / Arrays.stream(array).count();
    }
}
