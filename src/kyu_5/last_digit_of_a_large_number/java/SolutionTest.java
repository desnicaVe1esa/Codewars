package kyu_5.last_digit_of_a_large_number.java;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals(8, Kata.lastDigit(new BigInteger("2"), new BigInteger("7")));
        assertEquals(4, Kata.lastDigit(new BigInteger("4"), new BigInteger("1")));
        assertEquals(6, Kata.lastDigit(new BigInteger("4"), new BigInteger("2")));
        assertEquals(9, Kata.lastDigit(new BigInteger("9"), new BigInteger("7")));
    }
}