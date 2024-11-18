package kyu_6.sequences_and_series.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SequenceTest {
    @Test
    public void basicTests() {
        assertEquals("getScore(1) returns a wrong result", 50, Sequence.getScore(1));
        assertEquals("getScore(2) returns a wrong result", 150, Sequence.getScore(2));
        assertEquals("getScore(3) returns a wrong result", 300, Sequence.getScore(3));
        assertEquals("getScore(4) returns a wrong result", 500, Sequence.getScore(4));
        assertEquals("getScore(5) returns a wrong result", 750, Sequence.getScore(5));
    }
}
