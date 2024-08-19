package kyu_6.what_century_is_it.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("20th", Solution.whatCentury(1999));
        assertEquals("21st", Solution.whatCentury(2011));
        assertEquals("22nd", Solution.whatCentury(2154));
        assertEquals("23rd", Solution.whatCentury(2259));
    }
}