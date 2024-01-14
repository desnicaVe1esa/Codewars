package kyu_6.punch_card_reward_system;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("Point Left: 0. Free Item: 1. Pay Item: 2", Solution.CalculateReward(3, 3));
        assertEquals("Point Left: 0. Free Item: 4. Pay Item: 0",Solution.CalculateReward(20, 4));
        assertEquals("Point Left: 3. Free Item: 10. Pay Item: 17", Solution.CalculateReward(36, 27));
    }
}
