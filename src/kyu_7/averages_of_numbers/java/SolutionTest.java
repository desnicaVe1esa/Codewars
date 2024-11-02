package kyu_7.averages_of_numbers.java;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(Arrays.toString(new double[]{2, 2, 2, 2}), Arrays.toString(Kata.averages(new int[]{2, 2, 2, 2, 2})));
        assertEquals(Arrays.toString(new double[]{0, 0, 0, 0}), Arrays.toString(Kata.averages(new int[]{2, -2, 2, -2, 2})));
        assertEquals(Arrays.toString(new double[]{2, 4, 3, -4.5}), Arrays.toString(Kata.averages(new int[]{1, 3, 5, 1, -10})));
    }
}
