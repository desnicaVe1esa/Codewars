package kyu_6.good_vs_evil.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodVsEvilTest {
    @Test
    public void testEvilWin() {
        assertEquals("Evil should win", "Battle Result: Evil eradicates all trace of Good",
                GoodVsEvil.battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"));
    }

    @Test
    public void testGoodWin() {
        assertEquals("Good should win", "Battle Result: Good triumphs over Evil",
                GoodVsEvil.battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
    }

    @Test
    public void testTie() {
        assertEquals("Should be a tie", "Battle Result: No victor on this battle field",
                GoodVsEvil.battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
    }

    @Test
    public void test1() {
        assertEquals("Good should win", "Battle Result: Good triumphs over Evil",
                GoodVsEvil.battle("6180 122 5609 6048 1536 7205", "8403 8851 6257 5495 8875 1579 3177"));
    }
}