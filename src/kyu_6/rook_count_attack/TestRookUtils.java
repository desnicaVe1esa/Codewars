package kyu_6.rook_count_attack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRookUtils {
    @Test
    public void testFromImage() {
        int[][] rooks = {{2, 5}, {5, 3}, {5, 5}};
        int expected = 2;
        int actual = RookUtils.countAttackingRooks(rooks);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFromImage2() {
        int[][] rooks = {{1, 3}, {1, 5}, {3, 5}, {5, 5}, {5, 3}};
        int expected = 5;
        int actual = RookUtils.countAttackingRooks(rooks);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRooksOnDiagonal() {
        int[][] rooks = {{0, 0}, {1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}, {6, 6}, {7, 7}};
        int expected = 0;
        int actual = RookUtils.countAttackingRooks(rooks);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAttackingRooksEachOther() {
        int[][] rooks = {{1, 1}, {1, 6}};
        int expected = 1;
        int actual = RookUtils.countAttackingRooks(rooks);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRooksOnSameRow() {
        int[][] rooks = {{1, 1}, {1, 3}, {1, 5}, {1, 7}};
        int expected = 3;
        int actual = RookUtils.countAttackingRooks(rooks);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOneAttackingRook() {
        int[][] rooks = {{0, 0}, {2, 1}, {4, 2}, {6, 3}, {1, 5}, {3, 6}, {5, 7}, {7, 2}};
        int expected = 1;
        int actual = RookUtils.countAttackingRooks(rooks);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMultipleAttackingRooks() {
        int[][] rooks = {{0, 0}, {0, 4}, {4, 4}, {4, 2}, {4, 0}};
        int expected = 5;
        int actual = RookUtils.countAttackingRooks(rooks);
        Assertions.assertEquals(expected, actual);
    }
}
