package kyu_8.sleigh_authentication.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test_authentication() {
        assertEquals(true, Sleigh.authenticate("Santa Claus", "Ho Ho Ho!"));
        assertEquals(false, Sleigh.authenticate("Santa", "Ho Ho Ho!"));
        assertEquals(false, Sleigh.authenticate("Santa Claus", "Ho Ho Ho"));
    }
}