package kyu_8.sum_of_multiples.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SampleTests {

    @Test
    void basicTests() {
        assertEquals(20, Kata.sumMul(2, 9), "n = 2, m = 9");
        assertEquals(30, Kata.sumMul(5, 20), "n = 5, m = 20");
        assertEquals(1860, Kata.sumMul(4,123),"n = 4, m = 123");
        assertEquals(86469, Kata.sumMul(123,4567),"n = 123, m = 4567");
    }

    @Test
    void invalidTests() {
        assertThrows(IllegalArgumentException.class, () -> Kata.sumMul(0, 0), "n = 0, m = 0");
        assertThrows(IllegalArgumentException.class, () -> Kata.sumMul(4, -7), "n = 4, m = -7");
        assertThrows(IllegalArgumentException.class, () -> Kata.sumMul(-3, 10), "n = -3, m = 10");
    }
}

