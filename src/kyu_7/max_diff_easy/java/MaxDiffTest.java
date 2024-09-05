package kyu_7.max_diff_easy.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxDiffTest {

    @Test
    public void BasicTests() {

        assertEquals("only positives", 4, Kata.maxDiff(new int[]{ 1, 2, 3, 4, 5, 5, 4 }));
        assertEquals("only negatives", 30, Kata.maxDiff(new int[]{ -4, -5, -3, -1, -31 }));
        assertEquals("positives and negatives", 10, Kata.maxDiff(new int[]{ 1, 2, 3, 4, -5, 5, 4 }));
        assertEquals("single element", 0, Kata.maxDiff(new int[]{ 1000000 }));
        assertEquals("empty", 0, Kata.maxDiff(new int[]{}));
    }
}
