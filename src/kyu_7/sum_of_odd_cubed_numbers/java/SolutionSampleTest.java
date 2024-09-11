package kyu_7.sum_of_odd_cubed_numbers.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionSampleTest {
    @Test
    public void testSomething() {

        assertEquals(0, FindOddCubes.cubeOdd(new int[]{-5, -5, 5, 5}));
        assertEquals(28, FindOddCubes.cubeOdd(new int[]{1, 2, 3, 4}));
        assertEquals(0, FindOddCubes.cubeOdd(new int[]{-3, -2, 2, 3}));

    }
}
