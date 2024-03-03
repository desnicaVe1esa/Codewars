package kyu_7.count_the_divisors_of_a_number.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DividerTests {
    FindDivisor fd = new FindDivisor();

    @Test
    public void oneTest() {
        assertEquals("Should return 1 if the parameter equals 1", 1, fd.numberOfDivisors(1));
    }

    @Test
    public void fourTest() {
        assertEquals("Should return 3 if the parameter equals 4", 3, fd.numberOfDivisors(4));
    }

    @Test
    public void twelveTest() {
        assertEquals("Should return 6 if the parameter equals 12", 6, fd.numberOfDivisors(12));
    }
}