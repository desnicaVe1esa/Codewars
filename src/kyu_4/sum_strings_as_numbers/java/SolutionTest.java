package kyu_4.sum_strings_as_numbers.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class SolutionTest {
    @Test
    void test() {
        assertEquals("579", Kata.sumStrings("123", "456"));
        assertEquals("473583990087", Kata.sumStrings("473502874771", "81115316"));
    }
}
