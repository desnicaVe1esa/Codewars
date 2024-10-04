package kyu_7.array_leaders_array_series_3.java;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArrayLeaders
{
    @Test
    public void Check_Positive_Values()
    {
        assertEquals(Arrays.asList(4), Solution.arrayLeaders(new int[]{1,2,3,4,0}));
        assertEquals(Arrays.asList(17,5,2), Solution.arrayLeaders(new int[]{16,17,4,3,5,2}));
    }
    @Test
    public void Check_Negativee_Values()
    {
        assertEquals(Arrays.asList(-1), Solution.arrayLeaders(new int[]{-1,-29,-26,-2}));
        assertEquals(Arrays.asList(-36,-12), Solution.arrayLeaders(new int[]{-36,-12,-27}));
    }
    @Test
    public void Mixed_Values()
    {
        assertEquals(Arrays.asList(5,2), Solution.arrayLeaders(new int[]{5,2}));
        assertEquals(Arrays.asList(0,-1,3,2), Solution.arrayLeaders(new int[]{0,-1,-29,3,2}));
    }
}
