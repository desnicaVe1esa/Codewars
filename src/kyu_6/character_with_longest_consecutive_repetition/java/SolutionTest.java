package kyu_6.character_with_longest_consecutive_repetition.java;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void exampleTests() {
        assertArrayEquals(new Object[]{"a", 4}, Solution.longestRepetition("aaaabb"));
        assertArrayEquals(new Object[]{"a", 4}, Solution.longestRepetition("bbbaaabaaaa"));
        assertArrayEquals(new Object[]{"u", 3}, Solution.longestRepetition("cbdeuuu900"));
        assertArrayEquals(new Object[]{"b", 5}, Solution.longestRepetition("abbbbb"));
        assertArrayEquals(new Object[]{"a", 2}, Solution.longestRepetition("aabb"));
        assertArrayEquals(new Object[]{"", 0}, Solution.longestRepetition(""));
    }
}

