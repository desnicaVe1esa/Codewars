package kyu_6.find_the_missing_term_in_an_arithmetic_progression.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Sample tests")
class SampleTests {

    @Test
    @DisplayName("Increasing sequence: [1, 2, 4]")
    void testIncreasing_1() {
        assertEquals(3, Solution.findMissing(new int[]{ 1, 2, 4}), "Incorrect answer for [1, 2, 4]");
    }

    @Test
    @DisplayName("Increasing sequence: [1, 3, 4]")
    void testIncreasing_2() {
        assertEquals(2, Solution.findMissing(new int[]{ 1, 3, 4}), "Incorrect answer for [1, 3, 4]");
    }

    @Test
    @DisplayName("Decreasing sequence: [4, 2, 1]")
    void testDecreasing_1() {
        assertEquals(3, Solution.findMissing(new int[]{ 4, 2, 1}), "Incorrect answer for [4, 2, 1]");
    }

    @Test
    @DisplayName("Decreasing sequence: [4, 3, 1]")
    void testDecreasing_2() {
        assertEquals(2, Solution.findMissing(new int[]{ 4, 3, 1}), "Incorrect answer for [4, 3, 1]");
    }

    @Test
    @DisplayName("Constant sequence: [1, 1, 1]")
    void testConstant() {
        assertEquals(1, Solution.findMissing(new int[]{ 1, 1, 1}), "Incorrect answer for [1, 1, 1]");
    }
}
