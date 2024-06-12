package kyu_8.grasshopper_array_mean.java;

import java.util.Arrays;

public class GrassHopper {
    public static int findAverage(int[] nums) {
        return Arrays.stream(nums).sum() / nums.length;
    }
}