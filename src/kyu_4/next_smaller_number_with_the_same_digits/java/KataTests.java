package kyu_4.next_smaller_number_with_the_same_digits.java;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTests {
    @Test
    public void basicTests() {
        assertEquals(12, Kata.nextSmaller(21));
        assertEquals(790, Kata.nextSmaller(907));
        assertEquals(513, Kata.nextSmaller(531));
        assertEquals(-1, Kata.nextSmaller(1027));
        assertEquals(414, Kata.nextSmaller(441));
        assertEquals(123456789, Kata.nextSmaller(123456798));
    }
}