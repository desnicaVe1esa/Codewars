package kyu_8.find_the_position.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", Kata.position('a'));
        assertEquals("Position of alphabet: 26", Kata.position('z'));
        assertEquals("Position of alphabet: 5", Kata.position('e'));
    }
}