package kyu_4.next_bigger_number_with_the_same_digits.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTests {
    @Test
    public void basicTests() {
        assertEquals(21, Kata.nextBiggerNumber(12));
        assertEquals(531, Kata.nextBiggerNumber(513));
        assertEquals(2071, Kata.nextBiggerNumber(2017));
        assertEquals(441, Kata.nextBiggerNumber(414));
        assertEquals(414, Kata.nextBiggerNumber(144));
        assertEquals(19009, Kata.nextBiggerNumber(10990));
    }
}