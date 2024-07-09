package kyu_6.basics_08_find_next_higher_number_with_same_bits_1_s.java;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextHigherTest {

    @Test
    public void basicTests() {
//        assertEquals(256, Kata.cs.nextHigher(128), "for nextHigher(128)");
//        assertEquals(2, Kata.cs.nextHigher(1), "for nextHigher(1)");
        assertEquals(1279, Kata.nextHigher(1022), "for nextHigher(1022)");
        assertEquals(191, Kata.nextHigher(127), "for nextHigher(127)");
        assertEquals(1253359, Kata.nextHigher(1253343), "for nextHigher(1253343)");
    }
}
