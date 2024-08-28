package kyu_7.smoking_timmy.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void exampleTests() {
        assertEquals(22,SmokingTimmy.startSmoking(0,1));
        assertEquals(224,SmokingTimmy.startSmoking(1,0));
        assertEquals(247,SmokingTimmy.startSmoking(1,1));
        assertEquals(2294,SmokingTimmy.startSmoking(10,2));
        assertEquals(0,SmokingTimmy.startSmoking(0,0));
    }
}