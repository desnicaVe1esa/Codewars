package kyu_3.sudoku_solver.java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SudokuSolverTest {

    @Test
    public void sampleTests() {

        int[][] oneZero = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 0, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        int[][] twoZeroes = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 0, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 0, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        int[][] fiveZeroes = {
                {5, 0, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 0},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 0, 5, 0, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 0, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        int[][] manyZeroes = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        int[][] solution = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        int[][][] testCases = new int[4][9][9];
        testCases[0] = oneZero;
        testCases[1] = twoZeroes;
        testCases[2] = fiveZeroes;
        testCases[3] = manyZeroes;

        for (int[][] testCase : testCases) {
            int[][] input = clone(testCase);
            int[][] actual = SudokuSolver.sudoku(input);
            assertArrayEquals(solution, actual, String.format("Incorrect answer for board:\n\n%s\n", stringify(testCase)));
        }
    }

    private int[][] clone(int[][] board) { // From "Sudoku board validator" Java Solution
        return Arrays.stream(board).map(row -> Arrays.copyOf(row, row.length)).toArray(int[][]::new);
    }

    private String stringify(int[][] board) { // From "Sudoku board validator" Java Solution
        // Displays sudoku board nicely, with separators between the 3x3 subgrids.

        Function<int[], String> stringifyRow = row ->
                String.format("%d%d%d|%d%d%d|%d%d%d",
                        row[0], row[1], row[2],
                        row[3], row[4], row[5],
                        row[6], row[7], row[8]);
        List<String> rows = Arrays.stream(board).map(stringifyRow).toList();
        return String.join("\n", rows.subList(0,3)) +
                "\n---+---+---\n" +
                String.join("\n", rows.subList(3, 6)) +
                "\n---+---+---\n" +
                String.join("\n", rows.subList(6, 9));
    }
}
