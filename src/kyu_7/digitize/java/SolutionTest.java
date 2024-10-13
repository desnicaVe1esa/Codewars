package kyu_7.digitize.java;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Test
    public void fixedTests() {
        assertArrayEquals("Should work for 123", new int[] {1, 2, 3}, Solution.digitize(123));
        assertArrayEquals("Should work for 1", new int[] {1}, Solution.digitize(1));
        assertArrayEquals("Should work for 0", new int[] {0}, Solution.digitize(0));
        assertArrayEquals("Should work for 1230", new int[] {1, 2, 3, 0}, Solution.digitize(1230));
        assertArrayEquals("Should work for 8675309", new int[] {8, 6, 7, 5, 3, 0, 9}, Solution.digitize(8675309));
    }
}
