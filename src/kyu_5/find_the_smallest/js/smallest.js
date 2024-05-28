function smallest(n) {
    let row = String(n).split("");
    let min = [n, 0, 0],
        test = [];

    for (var i = 0, length = row.length; i < length; i++) {
        for (var j = 0; j < length; j++) {
            test = row.slice(0, i).concat(row.slice(i + 1));

            if (Number(test.slice(0, j).concat(row[i], test.slice(j)).join("")) < min[0]) {
                min = [Number(test.slice(0, j).concat(row[i], test.slice(j)).join("")), i, j];
            }
        }
    }
    return min;
}

module.exports = smallest;