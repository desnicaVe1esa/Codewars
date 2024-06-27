package kyu_7.sum_of_angles.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void sampleTests() {
        assertEquals(180, AngleSum.sumOfAngles(3));
        assertEquals(360, AngleSum.sumOfAngles(4));
    }
}