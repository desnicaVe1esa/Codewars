package kyu_8.get_the_mean_of_an_array.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void simpleTest() {
        assertEquals(2,School.getAverage(new int[] {2,2,2,2}));
        assertEquals(3,School.getAverage(new int[] {1,2,3,4,5}));
        assertEquals(1,School.getAverage(new int[] {1,1,1,1,1,1,1,2}));
    }
}