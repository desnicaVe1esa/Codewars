package kyu_7.simple_string_reversal.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals("srawedoc", Solution.solve("codewars"));
        assertEquals("edoc ruoy", Solution.solve("your code"));
        assertEquals("skco redo cruoy", Solution.solve("your code rocks"));
    }
}
