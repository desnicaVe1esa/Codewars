package kyu_8.what_is_between.java;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, Kata.between(1, 4));
        assertArrayEquals(new int[]{-2, -1, 0, 1, 2}, Kata.between(-2, 2));
    }
}
