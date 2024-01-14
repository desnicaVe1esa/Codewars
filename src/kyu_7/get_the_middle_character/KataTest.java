package kyu_7.get_the_middle_character;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KataTest {

    @Test
    public void evenTests() {
        assertEquals("es", Kata.getMiddle("you_can't_code_under_pressure _1"));
        assertEquals("dd", Kata.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", Kata.getMiddle("testing"));
        assertEquals("A", Kata.getMiddle("A"));
    }
}
