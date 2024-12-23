package kyu_7.minimum_steps_array_series_6.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumSteps {
    @Test
    public void checkSmallArraySize() {
        doTest(new int[]{4,6,3}, 7, 1);
        doTest(new int[]{10,9,9,8}, 17, 1);
    }
    @Test
    public void checkLargerArraySize() {
        doTest(new int[]{8,9,4,2}, 23, 3);
        doTest(new int[]{19,98,69,28,75,45,17,98,67}, 464, 8);
    }
    private void doTest(int[] numbers, int k, int expected) {
        assertEquals(expected, Kata.minimumSteps(numbers, k));
    }
}