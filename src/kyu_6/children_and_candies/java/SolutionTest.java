package kyu_6.children_and_candies.java;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(Arrays.toString(new int[]{6, 6}), Arrays.toString(CircleOfChildren.distributionOfCandy(new int[]{1, 2, 3, 4, 5})));
        assertEquals(Arrays.toString(new int[]{17, 18}), Arrays.toString(CircleOfChildren.distributionOfCandy(new int[]{10,2,8,22,16,4,10,6,14,20})));
        return;
    }
}
