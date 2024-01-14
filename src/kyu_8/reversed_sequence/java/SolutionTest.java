package kyu_8.reversed_sequence.java;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;


public class SolutionTest {
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1},Sequence.reverse(5));
    }
}
