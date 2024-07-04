package kyu_7.summation_triangle_number_1.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Example test cases")
class TriangleSumTests {
    @Test
    @DisplayName("Small tests")
    void test0() {
        assertEquals(1, TriangleSum.getSum(0));
        assertEquals(7, TriangleSum.getSum(1));
        assertEquals(22, TriangleSum.getSum(2));
        assertEquals(50, TriangleSum.getSum(3));
        assertEquals(666916695001L, TriangleSum.getSum(10000));
    }
}