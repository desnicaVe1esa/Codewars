package kyu_8.find_maximum_and_minimum_values_of_a_list.java;

import java.util.Arrays;

public class Kata {

    public int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }
}
