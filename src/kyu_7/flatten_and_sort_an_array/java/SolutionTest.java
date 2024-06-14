package kyu_7.flatten_and_sort_an_array.java;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {

    @Test
    public void exampleTest() {
        Assert.assertArrayEquals(new int[]{}, Kata.flattenAndSort(new int[][]{}));
        Assert.assertArrayEquals(new int[]{1}, Kata.flattenAndSort(new int[][]{{}, {1}}));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, Kata.flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}}));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 100}, Kata.flattenAndSort(new int[][]{{1, 3, 5}, {100}, {2, 4, 6}}));
        Assert.assertArrayEquals(new int[]{111, 333, 444, 555, 666, 777, 888, 999}, Kata.flattenAndSort(new int[][]{{111, 999}, {}, {333}, {444}, {888}, {777}, {666}, {555}}));
    }
}