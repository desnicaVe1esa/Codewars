package kyu_8.enumerable_magic_number_1_true_for_all.java;

import org.junit.Test;

import java.util.function.IntPredicate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest{
    private static final IntPredicate evenNumber = n -> n % 2 == 0;
    private static final IntPredicate oddNumber = n -> n % 2 != 0;
    private static final IntPredicate lessThan10 = n -> n < 10;
    private static final IntPredicate lessThan5 = n -> n < 5;
    private static final IntPredicate greaterThan1 = n -> n > 1;
    private static final IntPredicate greaterThan5 = n -> n > 5;
    private static final IntPredicate greaterThan10 = n -> n > 10;

    @Test
    public void fixedTests(){
        assertTrue(Solution.all(new int[]{2, 4, 6, 10}, evenNumber));
        assertFalse(Solution.all(new int[]{1, 3, 5, 10}, oddNumber));
        assertFalse(Solution.all(new int[]{2, 4, 6, 19}, lessThan10));
        assertTrue(Solution.all(new int[]{1, 1, 2}, lessThan5));
        assertTrue(Solution.all(new int[]{2, 9, 4, 3}, greaterThan1));
        assertFalse(Solution.all(new int[]{2, 9, 4, 0}, greaterThan1));
        assertFalse(Solution.all(new int[]{5, 6, 7, 8}, greaterThan5));
        assertTrue(Solution.all(new int[]{13, 42}, greaterThan10));

        assertFalse(Solution.all(new int[]{5}, evenNumber));
        assertTrue(Solution.all(new int[]{5}, oddNumber));
        assertFalse(Solution.all(new int[]{5}, lessThan5));

        assertTrue(Solution.all(new int[]{}, evenNumber));
        assertTrue(Solution.all(new int[]{}, lessThan5));
        assertTrue(Solution.all(new int[]{}, greaterThan10));
    }
}