package kyu_8.difference_of_volumes_of_cuboids.java;

import java.util.Arrays;

public class CuboidVolumes {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        return Math.abs(Arrays.stream(firstCuboid).reduce((a, b) -> a * b).getAsInt() - Arrays.stream(secondCuboid).reduce((a, b) -> a * b).getAsInt());
    }
}
