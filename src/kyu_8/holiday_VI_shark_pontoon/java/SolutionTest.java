package kyu_8.holiday_VI_shark_pontoon.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testSomething() {
        assertEquals("Alive!", SharkPontoon.shark(12, 50, 4, 8, true));
        assertEquals("Alive!", SharkPontoon.shark(7, 55, 4, 16, true));
        assertEquals("Shark Bait!", SharkPontoon.shark(24, 0, 4, 8, true));
    }
}

