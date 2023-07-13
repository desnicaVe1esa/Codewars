package invert_array_middle;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class FrameTest {
    @Test
    public void testCases() {
        Frame f = new Frame();
        assertEquals(new int[][] {{1}},f.invertArrayMiddle(1));
        assertEquals(new int[][] {{1,3},{2,4}},f.invertArrayMiddle(2));
        assertEquals(new int[][] {{1,4,7},{2,5,8},{3,6,9}},f.invertArrayMiddle(3));
        assertEquals(new int[][] {{1,5,9,13},{2,6,7,14},{3,10,11,15},{4,8,12,16}},f.invertArrayMiddle(4));
        assertEquals(new int[][] {{1,6,11,16,21},{2,7,8,9,22},{3,12,13,14,23},{4,17,18,19,24},{5,10,15,20,25}},f.invertArrayMiddle(5));
    }
}