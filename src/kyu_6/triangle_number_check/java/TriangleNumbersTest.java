package kyu_6.triangle_number_check.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TriangleNumbersTest {

    @Test
    public void test1() {
        assertEquals(TriangleNumbers.isTriangleNumber(125250), true);
    }
    @Test
    public void test2() {
        assertEquals(TriangleNumbers.isTriangleNumber(3126250), true);
    }
}
