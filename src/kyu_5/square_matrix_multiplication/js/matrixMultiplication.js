function matrixMultiplication(a, b) {
    let result = [];
    for (let row = 0; row < a.length; row++) {
        result[row] = [];
        for (let col = 0; col < b[0].length; col++) {
            result[row][col] = mult(a, b, row, col);
        }
    }
    return result;
}

function mult(a, b, row, col) {
    let position = 0;
    for (let i = 0; i < a[row].length; i++) {
        position += a[row][i]  *  b[i][col];
    }
    return position;
}

module.exports = matrixMultiplication;