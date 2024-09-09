package kyu_7.simple_beads_count.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test0() {
        assertEquals(0, BeadsCounter.countRedBeads(0));
    }
    @Test
    public void test1() {
        assertEquals(0, BeadsCounter.countRedBeads(1));
    }
    @Test
    public void test3() {
        assertEquals(4, BeadsCounter.countRedBeads(3));
    }
    @Test
    public void test5() {
        assertEquals(8, BeadsCounter.countRedBeads(5));
    }
}
