package kyu_8.unfinished_loop_bug_fixing_number_1.java;


import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Kata k = new Kata();

    @Test
    public void SampleTests() {
        assertEquals(Arrays.asList(1), k.CreateList(1));
        assertEquals(Arrays.asList(1,2), k.CreateList(2));
        assertEquals(Arrays.asList(1,2,3), k.CreateList(3));
        assertEquals(Arrays.asList(1,2,3,4), k.CreateList(4));
        assertEquals(Arrays.asList(1,2,3,4,5), k.CreateList(5));
    }
}