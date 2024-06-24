package kyu_7.maximum_product.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    MaxProduct m = new MaxProduct();
    private void test(String message, int expected, int actual) {
        assertEquals(message, expected, actual);
    }

    @Test
    public void fixedTests() {
        String message = "Positive numbers";
        test(message, 40, m.adjacentElementsProduct(new int[] {5, 8}));
        test(message, 6, m.adjacentElementsProduct(new int[] {1, 2, 3}));
        test(message, 90, m.adjacentElementsProduct(new int[] {1, 5, 10, 9}));
        test(message, 48, m.adjacentElementsProduct(new int[] {4, 12, 3, 1, 5}));
        test(message, 6, m.adjacentElementsProduct(new int[] {5, 1, 2, 3, 1, 4}));

        message = "Both positive and negative values";
        test(message, 21, m.adjacentElementsProduct(new int[] {3, 6, -2, -5, 7, 3}));
        test(message, 50, m.adjacentElementsProduct(new int[] {9, 5, 10, 2, 24, -1, -48}));
        test(message, 30, m.adjacentElementsProduct(new int[] {5, 6, -4, 2, 3, 2, -23}));
        test(message, -14, m.adjacentElementsProduct(new int[] {-23, 4, -5, 99, -27, 329, -2, 7, -921}));
        test(message, 6, m.adjacentElementsProduct(new int[] {5, 1, 2, 3, 1, 4}));

        message = "Contains zeroes";
        test(message, 0, m.adjacentElementsProduct(new int[] {1, 0, 1, 0, 1000}));
        test(message, 6, m.adjacentElementsProduct(new int[] {1, 2, 3, 0}));
    }
}