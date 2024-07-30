package kyu_7.switcheroo.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("abc",Switch.switcheroo( "bac"));
        assertEquals("ccc",Switch.switcheroo("ccc"));
        assertEquals("aaabcccbaaa",Switch.switcheroo("bbbacccabbb"));
    }
}
