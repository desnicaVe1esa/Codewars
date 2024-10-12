package kyu_7.halving_sum.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HalvingSumTest {
    @Test
    public void test() {
        HalvingSum hs = new HalvingSum();
        assertEquals(47,hs.halvingSum(25));
        assertEquals(247,hs.halvingSum(127));
    }
}
