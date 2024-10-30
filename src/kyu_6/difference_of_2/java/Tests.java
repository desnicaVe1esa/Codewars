package kyu_6.difference_of_2.java;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Tests {
    @Test
    public void sample_tests() {
        assertArrayEquals(
                new int[][]{{1, 3}, {2, 4}},
                Kata.twosDifference(new int[]{1, 2, 3, 4})
        );

        assertArrayEquals(
                new int[][]{{1, 3}, {4, 6}},
                Kata.twosDifference(new int[]{1, 3, 4, 6})
        );

        assertArrayEquals(
                new int[][]{{1, 3}, {3, 5}, {4, 6}},
                Kata.twosDifference(new int[]{4, 3, 1, 5, 6})
        );
    }
}
