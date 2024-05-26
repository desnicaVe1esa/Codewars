function sudoku(puzzle) {
    for (let i = 0; i < 9; i++) {
        for (let j = 0; j < 9; j++) {
            if (puzzle[j][i] !== 0) {
                continue;
            }
            let row = puzzle[j];
            let column = puzzle.map(row => row[i]);
            let squareX = Math.floor(i / 3);
            let squareY = Math.floor(j / 3);
            let squareNums = [0, 1, 2].map(i2 => [0, 1, 2].map(j2 => puzzle[squareY * 3 + j2][squareX * 3 + i2])).flat();
            let unique = new Set([...row, ...column, ...squareNums].filter(n => n));
            if (unique.size === 8) {
                puzzle[j][i] = [1, 2, 3, 4, 5, 6, 7, 8, 9].find(n => !unique.has(n));
                return sudoku(puzzle);
            }
        }
    }
    return puzzle;
}

module.exports = sudoku;