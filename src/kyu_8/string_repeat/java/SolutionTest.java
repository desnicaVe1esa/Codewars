package kyu_8.string_repeat.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test4a() {
        assertEquals("aaaa", Solution.repeatStr(4, "a"));
    }

    @Test
    public void test3Hello() {
        assertEquals("HelloHelloHello", Solution.repeatStr(3, "Hello"));
    }

    @Test
    public void test5empty() {
        assertEquals("", Solution.repeatStr(5, ""));
    }
}