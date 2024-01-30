package kyu_6.simple_fun_158_not_so_random.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SampleTests {
    @Test
    void tests() {
        assertEquals("Black", Kata.notSoRandom(1, 1));
        assertEquals("White", Kata.notSoRandom(2, 1));
        assertEquals("Black", Kata.notSoRandom(1, 2));
        assertEquals("White", Kata.notSoRandom(2, 2));
        assertEquals("White", Kata.notSoRandom(6, 9));
        assertEquals("White", Kata.notSoRandom(10000, 10000));
        assertEquals("Black", Kata.notSoRandom(11111, 22222));
    }
}
