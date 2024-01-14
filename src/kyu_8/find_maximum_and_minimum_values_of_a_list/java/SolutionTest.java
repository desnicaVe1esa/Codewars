package kyu_8.find_maximum_and_minimum_values_of_a_list.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Kata kata = new Kata();

    @Test
    public void testExamples() {
        assertEquals(-110, kata.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, kata.min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, kata.max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, kata.max(new int[]{5}));
    }
}