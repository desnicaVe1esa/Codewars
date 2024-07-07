package kyu_7.sum_of_a_sequence.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("Sample Test Cases")
    void testSomething() {
        assertEquals(12, Kata.sequenceSum(2, 6, 2), "sequenceSum(2, 6, 2)");
        assertEquals(15, Kata.sequenceSum(1, 5, 1), "sequenceSum(1, 5, 1)");
        assertEquals(5, Kata.sequenceSum(1, 5, 3), "sequenceSum(1, 5, 3)");
        assertEquals(45, Kata.sequenceSum(0, 15, 3), "sequenceSum(0, 15, 3)");
        assertEquals(0, Kata.sequenceSum(16, 15, 3), "sequenceSum(16, 15, 3)");
    }
}