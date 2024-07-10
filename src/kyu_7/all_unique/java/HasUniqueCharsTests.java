package kyu_7.all_unique.java;

import org.junit.Test;
import static org.junit.Assert.*;

public class HasUniqueCharsTests {

    @Test
    public void testBasicExamples() {
        assertFalse(Kata.hasUniqueChars("  nAa"));
        assertTrue(Kata.hasUniqueChars("abcde"));
        assertFalse(Kata.hasUniqueChars("++-"));
        assertTrue(Kata.hasUniqueChars("AaBbc"));
    }
}
