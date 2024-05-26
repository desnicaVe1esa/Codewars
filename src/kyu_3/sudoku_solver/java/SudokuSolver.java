package kyu_3.sudoku_solver.java;

public class SudokuSolver {
    public static int[][] sudoku(int[][] puzzle) {
        int N = puzzle.length;
        solveSudoku(puzzle, N);
        return puzzle;
    }

    private static boolean solveSudoku(int[][] board, int N) {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;
                            if (solveSudoku(board, N)) {
                                return true;
                            } else {
                                board[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(int[][] board, int row, int col, int num) {
        for (int x = 0; x < 9; x++) {
            if (board[row][x] == num || board[x][col] == num || board[3 * (row / 3) + x / 3][3 * (col / 3) + x % 3] == num) {
                return false;
            }
        }
        return true;
    }

}