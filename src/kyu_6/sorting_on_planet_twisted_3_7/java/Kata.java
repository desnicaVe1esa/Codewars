package kyu_6.sorting_on_planet_twisted_3_7.java;

import java.util.Arrays;

public class Kata {
    public static Integer[] sortTwisted37(Integer[] array) {
        return Arrays.stream(array).map(Kata::replace).sorted(Integer::compare).map(Kata::replace).toArray(Integer[]::new);
    }

    public static Integer replace(Integer integer) {
        return Integer.valueOf(integer.toString().replace("7", "_").replace("3", "7").replace("_", "3"));
    }
}
