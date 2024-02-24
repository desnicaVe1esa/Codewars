package kyu_7.shortest_word.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class KataTest {
    @Test
    void findShort() {
        assertEquals(3, Kata.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, Kata.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, Kata.findShort("Let's travel abroad shall we"));
    }

}