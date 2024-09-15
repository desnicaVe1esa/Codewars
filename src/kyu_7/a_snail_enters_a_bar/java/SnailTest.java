package kyu_7.a_snail_enters_a_bar.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SnailTest {
    @Test
    void testSnailMadeIt() {
        assertEquals(true, Snail.canSnailReachEnd(10, 2, 1));
        assertEquals(true, Snail.canSnailReachEnd(100, 10, 5));
        assertEquals(true, Snail.canSnailReachEnd(50, 5, 1));
        assertEquals(true, Snail.canSnailReachEnd(1000, 100, 10));
        assertEquals(true, Snail.canSnailReachEnd(1, 0.1, 0.01));
    }

    @Test
    void testSnailDidNotMakeIt() {
        assertEquals(false, Snail.canSnailReachEnd(100, 1, 2));
        assertEquals(false, Snail.canSnailReachEnd(100000, 0.1, 0.05));
        assertEquals(false, Snail.canSnailReachEnd(100, 0.5, 1));
        assertEquals(false, Snail.canSnailReachEnd(1000, 1, 2));
        assertEquals(false, Snail.canSnailReachEnd(500, 5, 10));
        assertEquals(false, Snail.canSnailReachEnd(10000, 0.1, 1));
    }
}

