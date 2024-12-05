package kyu_7.interlocking_binary_pairs.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InterlockableTests {
    @Test
    void SampleTests() {
        assertEquals(true,  Kata.interlockable(9, 4), "a = 9\nb = 4\n");
        assertEquals(false, Kata.interlockable(3, 6), "a = 3\nb = 6\n");
        assertEquals(true,  Kata.interlockable(5, 2), "a = 5\nb = 2\n");
        assertEquals(false, Kata.interlockable(7, 1), "a = 7\nb = 1\n");
        assertEquals(true,  Kata.interlockable(0, 8), "a = 0\nb = 8\n");
    }
}
