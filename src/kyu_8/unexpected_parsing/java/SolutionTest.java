package kyu_8.unexpected_parsing.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        assertEquals("busy", Kata.getStatus(true).get("status"));
        assertEquals("available", Kata.getStatus(false).get("status"));
    }
}

