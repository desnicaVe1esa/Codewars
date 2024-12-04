package kyu_7.extra_perfect_numbers_special_numbers_series_7.java;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Extra_Perfect_Numbers {
    @Test
    public void Check_Small_Positive_Values()
    {
        assertArrayEquals(new int[]{1,3},     Solution.extraPerfect(3));
        assertArrayEquals(new int[]{1,3,5},   Solution.extraPerfect(5));
        assertArrayEquals(new int[]{1,3,5,7}, Solution.extraPerfect(8));
    }
    @Test
    public void Check_Larger_Positive_Values()
    {
        assertArrayEquals(new int[]{1,3,5,7,9,11,13,15,17,19,21,23,25,27}, Solution.extraPerfect(28));
        assertArrayEquals(new int[]{1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39}, Solution.extraPerfect(39));
    }
}
