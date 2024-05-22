package kyu_7.make_me_slow.java;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void ActualTest() {
        long time = System.currentTimeMillis();
        Kata.makeMeSlow();
        long timeTaken = System.currentTimeMillis() - time;
        assertTrue("Time taken was " + timeTaken / 1000 + " seconds: Must take at least 7 seconds!", timeTaken >= 7000);
    }
}