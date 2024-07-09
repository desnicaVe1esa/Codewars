package kyu_8.multiply_the_number.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplyExampleTests {

    @Test
    void tests() {
        assertEquals(15, Kata.multiply(3), "For number = 3");
        assertEquals(250, Kata.multiply(10), "For number = 10");
        assertEquals(25000, Kata.multiply(200), "For number = 200");
        assertEquals(0, Kata.multiply(0), "For number = 0");
        assertEquals(-15, Kata.multiply(-3), "For number = -3");
    }
}