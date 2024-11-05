package kyu_6.mutual_recursion.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @CsvSource(textBlock = """
    #     n    f    m
          0,   1,   0
          5,   3,   3
         10,   6,   6
         15,   9,   9   
         25,  16,  16
    """)
    @ParameterizedTest(name = "n = {0}") @DisplayName("Sample tests")
    public void basicTests(int n, int expectedF, int expectedM) {
        assertEquals(expectedF, MutualRecursion.f(n), "f(%d)".formatted(n));
        assertEquals(expectedM, MutualRecursion.m(n), "m(%d)".formatted(n));
    }
}
