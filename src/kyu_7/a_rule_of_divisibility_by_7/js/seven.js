function seven(m) {
    let steps = 0;
    while (m > 99) {
        steps++;
        m = Math.floor(m / 10) - 2 * (m % 10);
    }
    return [m, steps];
}

module.exports = seven;