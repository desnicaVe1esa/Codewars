package kyu_6.simple_fun_200_luxurious_house.java;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SampleTests {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {3, 2, 0, 2, 0}, Solution.luxhouse(new int[] {1, 2, 3, 1, 2}));
        assertArrayEquals(new int[] {2, 3, 4, 0}, Solution.luxhouse(new int[] {3, 2, 1, 4}));
        assertArrayEquals(new int[] {3, 2, 0}, Solution.luxhouse(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {0, 0, 0}, Solution.luxhouse(new int[] {3, 2, 1}));
        assertArrayEquals(new int[] {1, 1, 0}, Solution.luxhouse(new int[] {1, 1, 1}));
    }
}