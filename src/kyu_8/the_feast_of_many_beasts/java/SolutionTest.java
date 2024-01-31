package kyu_8.the_feast_of_many_beasts.java;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void fixedTest() {
        assertTrue(Kata.feast("great blue heron","garlic nann"));
        assertTrue(Kata.feast("chickadee","chocolate cake"));
        assertFalse(Kata.feast("brown bear","bear claw"));
    }
}
