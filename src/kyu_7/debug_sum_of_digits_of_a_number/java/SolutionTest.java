package kyu_7.debug_sum_of_digits_of_a_number.java;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Sample Tests")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SolutionTest {
    @Test
    @Order(1)
    @DisplayName("First sample test")
    void sampleTestOne() {
        assertEquals(6, Solution.sumOfDigits(123), "For input: " + 123);
    }
    @Test
    @Order(2)
    @DisplayName("Second sample test")
    void sampleTestTwo() {
        assertEquals(1, Solution.sumOfDigits(1), "For input: " + 1);
    }
    @Test
    @Order(3)
    @DisplayName("Third sample test")
    void sampleTestThree() {
        assertEquals(1, Solution.sumOfDigits(100), "For input: " + 100);
    }
    @Test
    @Order(4)
    @DisplayName("Fourth sample test")
    void sampleTestFour() {
        assertEquals(12, Solution.sumOfDigits(291), "For input: " + 291);
    }
    @Test
    @Order(5)
    @DisplayName("Fifth sample test")
    void sampleTestFive() {
        assertEquals(36, Solution.sumOfDigits(9999), "For input: " + 9999);
    }
}

