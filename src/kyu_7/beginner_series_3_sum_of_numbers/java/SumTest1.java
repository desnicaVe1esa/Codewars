package kyu_7.beginner_series_3_sum_of_numbers.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SumTest1 {

    Sum s = new Sum();

    @Test
    public void Test1() {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
    }

}
