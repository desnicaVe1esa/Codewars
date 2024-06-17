package kyu_7.filter_the_number.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SampleTest {
    @Test
    public void exampleTests() {
        assertEquals(123, Kata.filterString("123"));
        assertEquals(123, Kata.filterString("a1b2c3"));
        assertEquals(123, Kata.filterString("aa1bb2cc3dd"));
    }
}