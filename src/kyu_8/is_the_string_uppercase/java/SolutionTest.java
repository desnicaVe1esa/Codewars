package kyu_8.is_the_string_uppercase.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SolutionTest {
    @Test @DisplayName("Basic Tests")
    void basicTests() {
        assertFalse(Kata.isUpperCase("c"), "Input: 'c'");
        assertTrue(Kata.isUpperCase("C"), "Input: 'C'");
        assertFalse(Kata.isUpperCase("hello I AM DONALD"), "Input: 'hello I AM DONALD'");
        assertTrue(Kata.isUpperCase("HELLO I AM DONALD"), "Input: 'HELLO I AM DONALD'");
        assertFalse(Kata.isUpperCase("ACSKLDFJSgSKLDFJSKLDFJ"), "Input: 'ACSKLDFJSgSKLDFJSKLDFJ'");
        assertTrue(Kata.isUpperCase("ACSKLDFJSGSKLDFJSKLDFJ"), "Input: 'ACSKLDFJSGSKLDFJSKLDFJ'");
    }
}
