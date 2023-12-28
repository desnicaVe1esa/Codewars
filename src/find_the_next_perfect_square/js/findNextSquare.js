function findNextSquare(sq) {
    if (Math.sqrt(sq) % 1 !== 0) {
        return -1;
    }
    let root = Math.sqrt(sq);
    return (root + 1) * (root + 1);
}

module.exports = findNextSquare;