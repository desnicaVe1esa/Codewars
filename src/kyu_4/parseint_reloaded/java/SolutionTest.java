package kyu_4.parseint_reloaded.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionTest {

    @Test
    public void fixedTests() {
        assertEquals(1 , Parser.parseInt("one"));
        assertEquals(20 , Parser.parseInt("twenty"));
        assertEquals(246 , Parser.parseInt("two hundred forty-six"));
    }
}