package kyu_7.simple_fun_152_invite_more_women.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(true, Kata.inviteMoreWomen(new int[] {1, -1, 1}));
        assertEquals(false, Kata.inviteMoreWomen(new int[] {-1, -1, -1}));
        assertEquals(false, Kata.inviteMoreWomen(new int[] {1, -1}));
        assertEquals(true, Kata.inviteMoreWomen(new int[] {1, 1, 1}));
    }
}
