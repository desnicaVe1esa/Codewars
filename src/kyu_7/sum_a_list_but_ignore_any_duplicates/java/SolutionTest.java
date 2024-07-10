package kyu_7.sum_a_list_but_ignore_any_duplicates.java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
class SolutionTest {
    @Test
    void sampleTests() {
        assertEquals(5 , Solution.sumNoDuplicates(new int[]{1, 1, 2, 3}), "Incorrect answer for arr = "+ Arrays.toString(new int[]{1, 1, 2, 3}));
        assertEquals(6 , Solution.sumNoDuplicates(new int[]{1, 2, 3}), "Incorrect answer for arr = "+ Arrays.toString(new int[]{1,2,3}));
        assertEquals(3 , Solution.sumNoDuplicates(new int[]{1, 1, 2, 2, 3}), "Incorrect answer for arr = "+ Arrays.toString(new int[]{1, 1, 2, 2, 3}));
    }
}
