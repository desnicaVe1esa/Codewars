package kyu_8.calculate_average.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testSomething() {
        assertEquals(1, Kata.find_average(new int[]{1, 1, 1}), DELTA);
        assertEquals(2, Kata.find_average(new int[]{1, 2, 3}), DELTA);
    }
}
