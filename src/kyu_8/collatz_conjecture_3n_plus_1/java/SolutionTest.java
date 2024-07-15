package kyu_8.collatz_conjecture_3n_plus_1.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void sampleTests() {
        assertEquals(CollatzConjecture.hotpo(1), 0);
        assertEquals(CollatzConjecture.hotpo(5), 5);
        assertEquals(CollatzConjecture.hotpo(6), 8);
        assertEquals(CollatzConjecture.hotpo(23), 15);
    }
}
