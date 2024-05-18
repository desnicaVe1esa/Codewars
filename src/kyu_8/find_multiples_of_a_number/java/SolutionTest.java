package kyu_8.find_multiples_of_a_number.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// TODO: Replace examples and use TDD by writing your own tests

class SolutionTest {
    @Test
    void testExamples() {
        assertArrayEquals(new int[] { 5, 10, 15, 20, 25 }, Multiples.find(5, 25), "Testing for base=5 and limit=25");
        assertArrayEquals(new int[] { 1, 2 }, Multiples.find(1, 2), "Testing for base=1 and limit=2");
        assertArrayEquals(new int[] { 5 }, Multiples.find(5, 7), "Testing for base=5 and limit=7");
        assertArrayEquals(new int[] { 4, 8, 12, 16, 20, 24 }, Multiples.find(4, 27), "Testing for base=4 and limit=27");
        assertArrayEquals(new int[] { 11, 22, 33, 44 }, Multiples.find(11, 54), "Testing for base=11 and limit=54");
    }
}
