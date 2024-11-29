package kyu_6.factors_of_triangle_numbers.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TriangleFactorsTest {
    @Test
    public void test1() {
        TriangleFactors tf = new TriangleFactors();
        assertEquals(3, tf.calculate(1));
        assertEquals(6, tf.calculate(2));
        assertEquals(28, tf.calculate(5));
    }
}