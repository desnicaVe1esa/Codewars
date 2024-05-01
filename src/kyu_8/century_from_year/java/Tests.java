package kyu_8.century_from_year.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void FixedTests() {
        assertEquals(18, Solution.century(1705));
        assertEquals(19, Solution.century(1900));
        assertEquals(17, Solution.century(1601));
        assertEquals(20, Solution.century(2000));
        assertEquals(1, Solution.century(89));
    }
}