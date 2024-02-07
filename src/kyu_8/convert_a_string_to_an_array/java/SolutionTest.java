package kyu_8.convert_a_string_to_an_array.java;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, Solution.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, Solution.stringToArray("I love arrays they are my favorite"));
    }
}
