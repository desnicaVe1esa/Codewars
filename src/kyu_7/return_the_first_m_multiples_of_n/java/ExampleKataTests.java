package kyu_7.return_the_first_m_multiples_of_n.java;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ExampleKataTests {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {5, 10, 15}, Kata.multiples(3, 5));
    }
}
