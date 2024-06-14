package kyu_7.dont_give_me_five.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTests {
    @Test
    public void exampleTests() {
        assertEquals(8, Kata.dontGiveMeFive(1, 9));
        assertEquals(12, Kata.dontGiveMeFive(4, 17));
    }
}