package kyu_8.smallest_unused_id.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void fixedTests() {
        assertEquals(4, Kata.nextId(new int[] { 0, 1, 2, 3, 5 }));
        assertEquals(4, Kata.nextId(new int[] { 1, 2, 0, 2, 3 }));
        assertEquals(4, Kata.nextId(new int[] { 1, 2, 0, 2, 3, 5 }));
        assertEquals(11, Kata.nextId(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
    }
}

