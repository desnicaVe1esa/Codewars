package kyu_6.summation_triangle_number_3.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Example test cases")
class TriangleSumTests {
    @Test
    @DisplayName("Small tests")
    void test0() {
        assertEquals(1, TriangleSum.getSum(0));
        assertEquals(-4, TriangleSum.getSum(1));
        assertEquals(0, TriangleSum.getSum(2));
        assertEquals(-18, TriangleSum.getSum(3));
    }
}