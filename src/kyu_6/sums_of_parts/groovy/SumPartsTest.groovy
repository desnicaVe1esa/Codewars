package kyu_6.sums_of_parts.groovy;

import static org.junit.Assert.*;
import org.junit.Test;

public class SumPartsTest {

    private static void dotest(int[] ls, int[] expect) {
        int[] actual = SumParts.sumParts(ls)
        assertArrayEquals(expect, actual)
    }
    @Test
    public void basicTests() {
        int[] a = [0, 1, 3, 6, 10]
        int[] b = [20, 20, 19, 16, 10, 0]
        dotest(a, b)
        a = []
        b = [0]
        dotest(a, b)
        a = [1, 2, 3, 4, 5, 6]
        b = [21, 20, 18, 15, 11, 6, 0]
        dotest(a, b)

    }
}