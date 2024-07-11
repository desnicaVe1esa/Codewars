function pyramid(n) {
    let prepared = [];
    let size = 1;
    for (let i = 0; i < n; i++) {
        prepared[i] = [size];
        for (let j = 0; j < size; j++) {
            prepared[i][j] = 1;
        }
        size++;
    }
    return prepared;
}
module.exports = pyramid;